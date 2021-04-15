package wjc.scab.ch0708.sentinel.dubbo.comsumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wjc.scab.ch0708.sentinel.dubbo.api.IHelloService;


@RestController
public class HelloController {

    @DubboReference
    IHelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        return helloService.sayHello();
    }
}
