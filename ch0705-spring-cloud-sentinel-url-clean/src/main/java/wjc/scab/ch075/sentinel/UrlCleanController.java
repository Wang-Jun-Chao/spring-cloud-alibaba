package wjc.scab.ch075.sentinel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UrlCleanController {

    @GetMapping("/clean/{id}")
    public String dash(@PathVariable("id") int id) {
        return "Hello clean";
    }
}
