package wjc.scab.ch0505.dubbo.nacos.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan
@SpringBootApplication
public class NacosSampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSampleProviderApplication.class, args);
    }

}
