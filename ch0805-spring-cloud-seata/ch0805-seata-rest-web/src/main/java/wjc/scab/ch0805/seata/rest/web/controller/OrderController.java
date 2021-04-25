package wjc.scab.ch0805.seata.rest.web.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import wjc.scab.ch0805.seata.common.dto.OrderRequest;
import wjc.scab.ch0805.seata.common.response.ObjectResponse;
import wjc.scab.ch0805.seata.rest.web.service.IRestOrderService;


@Slf4j
@RestController
public class OrderController {

    @Autowired
    IRestOrderService restOrderService;

    @PostMapping("/order")
    ObjectResponse order(@RequestBody OrderRequest orderRequest) throws Exception {
        return restOrderService.handleBusiness(orderRequest);
    }
}
