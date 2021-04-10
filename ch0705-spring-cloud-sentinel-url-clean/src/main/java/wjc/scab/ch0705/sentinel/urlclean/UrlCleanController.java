package wjc.scab.ch0705.sentinel.urlclean;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UrlCleanController {

    @GetMapping(value = "/clean/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String dash(@PathVariable("id") int id) {
        return "Hello clean";
    }
}
