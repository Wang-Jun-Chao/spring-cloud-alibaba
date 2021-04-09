package wjc.scab.springcloud.dubbo.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import wjc.scab.springcloud.dubbo.api.IHelloService;

@DubboService
public class HelloServiceImpl implements IHelloService {
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s]：Hello,%s", serviceName, name);
    }
}
