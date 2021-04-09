package wjc.scab.ch0602.nacos.config.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *
 * </pre>
 * Author: 王俊超
 * Date: 2021-04-04 06:45
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
@RestController
public class NacosConfigController {
    @NacosValue(value = "${info:Local Hello World}", autoRefreshed = true)
    private String info;

    @GetMapping("/config")
    public String get() {
        return info;
    }
}
