package wjc.scab.ch0805.seata.order.provider.convert;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import wjc.scab.ch0805.seata.common.dto.OrderDto;
import wjc.scab.ch0805.seata.order.provider.dal.entitys.Order;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-25T18:29:20+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_144 (Oracle Corporation)"
)
@Component
public class OrderConvertImpl implements OrderConvert {

    @Override
    public Order dto2Order(OrderDto orderDto) {
        if ( orderDto == null ) {
            return null;
        }

        Order order = new Order();

        order.setCount( orderDto.getOrderCount() );
        if ( orderDto.getOrderAmount() != null ) {
            order.setAmount( orderDto.getOrderAmount().doubleValue() );
        }
        order.setOrderNo( orderDto.getOrderNo() );
        order.setUserId( orderDto.getUserId() );
        order.setProductCode( orderDto.getProductCode() );

        return order;
    }
}
