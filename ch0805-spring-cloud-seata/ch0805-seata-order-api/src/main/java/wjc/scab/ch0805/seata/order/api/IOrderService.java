package wjc.scab.ch0805.seata.order.api;

import wjc.scab.ch0805.seata.common.dto.OrderDto;
import wjc.scab.ch0805.seata.common.response.ObjectResponse;

/**
 * <pre>
 *
 * </pre>
 * Author: 王俊超
 * Date: 2021-04-25 08:20
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public interface IOrderService {
    /**
     * 创建订单
     *
     * @param orderDto
     * @return
     */
    ObjectResponse<OrderDto> createOrder(OrderDto orderDto);
}
