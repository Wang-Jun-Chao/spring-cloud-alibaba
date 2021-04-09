package wjc.scab.ch075.sentinel.dashboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DashboardController {

    @GetMapping("/dash")
    public String dash() {
        return "Hello Dash";
    }
}
