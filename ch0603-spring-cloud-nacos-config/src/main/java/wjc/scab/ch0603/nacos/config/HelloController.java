package wjc.scab.ch0603.nacos.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * RefreshScope是为了让nacos配置修改后生效
 */
@RestController
@RefreshScope
public class HelloController {


    @Value(value = "${info:Local Hello World}")
    private String info;

    @GetMapping("/config")
    public String get() {
        return info;
    }
}
