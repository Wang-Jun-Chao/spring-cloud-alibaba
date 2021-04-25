package wjc.scab.ch0805.seata.rest.web.service;


import wjc.scab.ch0805.seata.common.dto.OrderRequest;
import wjc.scab.ch0805.seata.common.response.ObjectResponse;

public interface IRestOrderService {

    ObjectResponse handleBusiness(OrderRequest orderRequest) throws Exception;
}
