package wjc.scab.ch0805.seata.order.provider.impl;


import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import wjc.scab.ch0805.seata.account.api.IAccountService;
import wjc.scab.ch0805.seata.common.constants.ResCode;
import wjc.scab.ch0805.seata.common.dto.AccountDto;
import wjc.scab.ch0805.seata.common.dto.OrderDto;
import wjc.scab.ch0805.seata.common.response.ObjectResponse;
import wjc.scab.ch0805.seata.order.api.IOrderService;
import wjc.scab.ch0805.seata.order.provider.convert.OrderConvert;
import wjc.scab.ch0805.seata.order.provider.dal.entitys.Order;
import wjc.scab.ch0805.seata.order.provider.dal.mappers.OrderMapper;

import java.util.UUID;


@Slf4j
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    OrderMapper orderMapper;
    @Autowired
    OrderConvert orderConvert;
    @Reference
    IAccountService accountService;

    @Override
    public ObjectResponse<OrderDto> createOrder(OrderDto orderDto) {
        log.info("全局事务ID：" + RootContext.getXID());
        ObjectResponse response = new ObjectResponse();
        try {
            //账户扣款
            AccountDto accountDto = new AccountDto();
            accountDto.setUserId(orderDto.getUserId());
            accountDto.setBalance(orderDto.getOrderAmount());
            ObjectResponse accountRes = accountService.decreaseAccount(accountDto);
            //创建订单
            Order order = orderConvert.dto2Order(orderDto);
            order.setOrderNo(UUID.randomUUID().toString());
            orderMapper.createOrder(order);
            //判断扣款状态(判断可以前置）
            if (accountRes.getCode() != ResCode.SUCCESS.getCode()) {
                response.setMsg(ResCode.FAILED.getMessage());
                response.setCode(ResCode.FAILED.getCode());
                return response;
            }
            response.setMsg(ResCode.SUCCESS.getMessage());
            response.setCode(ResCode.SUCCESS.getCode());
        } catch (Exception e) {
            log.error("createOrder Occur Exception:" + e);
            response.setCode(ResCode.SYSTEM_EXCEPTION.getCode());
            response.setMsg(ResCode.SYSTEM_EXCEPTION.getMessage() + "-" + e.getMessage());
        }
        return response;
    }
}
