package wjc.scab.ch0505.dubbo.nacos.provider;

import org.apache.dubbo.config.annotation.DubboService;
import wjc.scab.ch0505.dubbo.nacos.api.IHelloService;

@DubboService
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String name) {
        return "Hello World:" + name;
    }
}
