package wjc.scab.ch0805.seata.account.api;

import wjc.scab.ch0805.seata.common.dto.AccountDto;
import wjc.scab.ch0805.seata.common.response.ObjectResponse;

/**
 * <pre>
 *
 * </pre>
 * Author: 王俊超
 * Date: 2021-04-18 07:15
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public interface IAccountService {
    /**
     * 从账户扣款
     *
     * @param accountDto
     * @return
     */
    ObjectResponse<?> decreaseAccount(AccountDto accountDto);
}
