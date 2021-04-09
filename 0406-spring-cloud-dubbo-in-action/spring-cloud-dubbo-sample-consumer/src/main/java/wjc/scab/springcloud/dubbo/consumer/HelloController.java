package wjc.scab.springcloud.dubbo.consumer;


import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wjc.scab.springcloud.dubbo.api.IHelloService;

@RestController
public class HelloController {

    @DubboReference(mock = "wjc.scab.springcloud.dubbo.consumer.MockHelloService",
            cluster = "failfast")
    private IHelloService iHelloService;

    @GetMapping("/say")
    public String sayHello() {
        return iHelloService.sayHello("Wangjunchao");
    }
}
