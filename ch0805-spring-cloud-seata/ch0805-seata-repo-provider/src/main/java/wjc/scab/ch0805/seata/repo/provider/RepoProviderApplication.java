package wjc.scab.ch0805.seata.repo.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "wjc.scab.ch0805.seata.repo.provider.dal.mappers")
@SpringBootApplication
public class RepoProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepoProviderApplication.class, args);
    }

}
