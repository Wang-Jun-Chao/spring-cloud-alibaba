package wjc.scab.ch0805.seata.account.provider.dal.entitys;

import lombok.Data;


@Data
public class Account {
    private Integer id;
    private String userId;
    private Double balance;
}
