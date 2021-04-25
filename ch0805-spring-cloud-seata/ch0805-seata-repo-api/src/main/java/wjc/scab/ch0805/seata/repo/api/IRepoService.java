package wjc.scab.ch0805.seata.repo.api;

import wjc.scab.ch0805.seata.common.dto.ProductDto;
import wjc.scab.ch0805.seata.common.response.ObjectResponse;

/**
 * <pre>
 *
 * </pre>
 * Author: 王俊超
 * Date: 2021-04-25 08:43
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public interface IRepoService {

    /**
     * 扣减库存
     */
    ObjectResponse<?> decreaseRepo(ProductDto productDto);
}
