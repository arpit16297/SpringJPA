package com.Practice.SpringBootPractice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/Welcome")
    public String Hello() {
        return "Hello Welcome";
    }
}
