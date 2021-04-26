package wjc.scab.ch0805.seata.order.provider.convert;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import wjc.scab.ch0805.seata.common.dto.OrderDto;
import wjc.scab.ch0805.seata.order.provider.dal.entitys.Order;

@Mapper(componentModel = "spring")
public interface OrderConvert {

    @Mappings({
            @Mapping(source = "orderCount", target = "count"),
            @Mapping(source = "orderAmount", target = "amount")
    })
    Order dto2Order(OrderDto orderDto);
}
