package wjc.scab.ch0805.seata.account.provider.dal.mappers;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {

    int decreaseAccount(@Param("userId") String userId, @Param("balance") Double balance);
}
