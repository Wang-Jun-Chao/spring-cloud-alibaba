package wjc.scab.ch0706.sentinel.dynamicrule;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DynamicController {

    @GetMapping(value = "/dynamic")
    public String dynamic() {
        return "Hello Dynamic Rule";
    }
}
