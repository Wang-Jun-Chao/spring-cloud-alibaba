package wjc.scab.ch0805.seata.order.provider.dal.entitys;

import lombok.Data;

@Data
public class Order {
    private Integer id;
    private String orderNo;
    private String userId;
    private String productCode;
    private Integer count;
    private Double amount;
}
