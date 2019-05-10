package com.iamyash.starter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String greeting(@RequestParam String name, @RequestParam int num1, @RequestParam int num2) {
        return "Hello " + name + ". Total is: " + String.valueOf(num1 + num2);
    }
}
