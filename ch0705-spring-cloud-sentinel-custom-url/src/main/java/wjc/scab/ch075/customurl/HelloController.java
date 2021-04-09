package wjc.scab.ch075.customurl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @SentinelResource(value = "hello", blockHandlerClass = CustomUrlBlockHandler.class)
    @GetMapping("/say")
    public String hello() {
        return "hello, WJC";
    }

}
