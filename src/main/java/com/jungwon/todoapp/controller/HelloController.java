package com.jungwon.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Spring MVC
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello"; //hello.html 을 사용하도록 하겠다. .html은 생략.
    }

}
