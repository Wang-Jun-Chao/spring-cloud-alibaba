package wjc.scab.ch0708.sentinel.dubbo.provider;

import org.apache.dubbo.config.ConsumerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SentinelDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelDubboProviderApplication.class, args);
    }
}
