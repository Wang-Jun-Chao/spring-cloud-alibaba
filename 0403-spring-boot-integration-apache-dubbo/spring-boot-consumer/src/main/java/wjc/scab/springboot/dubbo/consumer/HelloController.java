package wjc.scab.springboot.dubbo.consumer;


import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wjc.scab.springboot.dubbo.api.IHelloService;

@RestController
public class HelloController {

    @Reference(url = "dubbo://127.0.0.1:20880/wjc.scab.springboot.dubbo.api.IHelloService")
    private IHelloService helloService;

    @GetMapping("/say")
    public String sayHello(){
        return helloService.sayHello("WangJunchao");
    }

}
