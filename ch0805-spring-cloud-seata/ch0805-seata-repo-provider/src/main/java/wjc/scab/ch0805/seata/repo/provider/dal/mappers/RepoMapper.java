package wjc.scab.ch0805.seata.repo.provider.dal.mappers;

import org.apache.ibatis.annotations.Param;


public interface RepoMapper {

    /**
     * @param productCode
     * @param count
     * @return
     */
    int decreaseRepo(@Param("productCode") String productCode, @Param("count") Integer count);
}
