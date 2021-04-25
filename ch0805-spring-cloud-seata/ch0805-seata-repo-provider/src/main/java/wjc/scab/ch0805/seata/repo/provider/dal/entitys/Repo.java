package wjc.scab.ch0805.seata.repo.provider.dal.entitys;

import lombok.Data;

@Data
public class Repo {
    private Integer id;
    private String productCode;
    private String name;
    private Integer count;
}
