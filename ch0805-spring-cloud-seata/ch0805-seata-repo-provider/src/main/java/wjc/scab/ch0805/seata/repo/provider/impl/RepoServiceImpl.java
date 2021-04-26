package wjc.scab.ch0805.seata.repo.provider.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import wjc.scab.ch0805.seata.common.constants.ResCode;
import wjc.scab.ch0805.seata.common.dto.ProductDto;
import wjc.scab.ch0805.seata.common.response.ObjectResponse;
import wjc.scab.ch0805.seata.repo.api.IRepoService;
import wjc.scab.ch0805.seata.repo.provider.dal.mappers.RepoMapper;


@Slf4j
@Service
public class RepoServiceImpl implements IRepoService {
    @Autowired
    RepoMapper repoMapper;

    @Override
    public ObjectResponse decreaseRepo(ProductDto productDto) {
        ObjectResponse response = new ObjectResponse();
        try {
            int repo = repoMapper.decreaseRepo(productDto.getProductCode(), productDto.getCount());
            if (repo > 0) {
                response.setMsg(ResCode.SUCCESS.getMessage());
                response.setCode(ResCode.SUCCESS.getCode());
                return response;
            }
            response.setMsg(ResCode.FAILED.getMessage());
            response.setCode(ResCode.FAILED.getCode());
        } catch (Exception e) {
            log.error("decreaseRepo Occur Exception:" + e);
            response.setCode(ResCode.SYSTEM_EXCEPTION.getCode());
            response.setMsg(ResCode.SYSTEM_EXCEPTION.getMessage() + "-" + e.getMessage());
        }
        return response;
    }
}
