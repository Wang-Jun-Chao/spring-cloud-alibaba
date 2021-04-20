package wjc.scab.ch0805.seata.account.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <pre>
 *
 * </pre>
 * Author: 王俊超
 * Date: 2021-04-18 07:18
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
@MapperScan(basePackages = "wjc.scab.ch0805.seata.account.provider.dal.mappers")
@SpringBootApplication
public class Ch0805AccountProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ch0805AccountProviderApplication.class);
    }
}
