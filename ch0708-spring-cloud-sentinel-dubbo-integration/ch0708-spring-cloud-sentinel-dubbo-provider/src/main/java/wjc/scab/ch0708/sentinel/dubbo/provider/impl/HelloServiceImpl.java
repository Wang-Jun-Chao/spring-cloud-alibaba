package wjc.scab.ch0708.sentinel.dubbo.provider.impl;

import wjc.scab.ch0708.sentinel.dubbo.api.IHelloService;
import org.apache.dubbo.config.annotation.Service;


@Service
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello() {
        return "Hello WJC";
    }
}
