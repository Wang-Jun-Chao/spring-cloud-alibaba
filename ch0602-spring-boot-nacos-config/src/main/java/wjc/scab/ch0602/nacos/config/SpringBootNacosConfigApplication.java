package wjc.scab.ch0602.nacos.config;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <pre>
 *
 * </pre>
 * Author: 王俊超
 * Date: 2021-04-04 06:53
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
@NacosPropertySource(dataId = "example",  autoRefreshed = true)
@SpringBootApplication
public class SpringBootNacosConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootNacosConfigApplication.class, args);
    }
}
