package wjc.scab.ch0505.dubbo.nacos.consumer;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wjc.scab.ch0505.dubbo.nacos.api.IHelloService;

@RestController
public class HelloController {

    @Reference
    private IHelloService helloService;

    @GetMapping("/say")
    public String sayHello(){
        return helloService.sayHello("Wjc");
    }
}
