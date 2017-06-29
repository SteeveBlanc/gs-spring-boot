package hello.subFolder;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hiddenController{

    @RequestMapping("/hello")
    String autoDetectedBySpringBoot() {
        return "Hello World!";
    }
}