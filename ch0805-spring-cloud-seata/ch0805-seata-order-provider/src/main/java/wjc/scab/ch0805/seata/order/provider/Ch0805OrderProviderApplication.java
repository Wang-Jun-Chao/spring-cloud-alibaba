package wjc.scab.ch0805.seata.order.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "wjc.scab.ch0805.seata.order.provider.dal")
@SpringBootApplication
public class Ch0805OrderProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch0805OrderProviderApplication.class, args);
    }

}
