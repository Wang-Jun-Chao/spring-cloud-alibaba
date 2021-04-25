package wjc.scab.ch0805.seata.order.provider.dal.mappers;


import wjc.scab.ch0805.seata.order.provider.dal.entitys.Order;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
public interface OrderMapper {

    /**
     * 创建订单
     *
     * @param order
     */
    void createOrder(Order order);
}
