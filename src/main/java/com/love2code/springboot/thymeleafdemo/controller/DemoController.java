package com.love2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Controller
public class DemoController {
    RestTemplate template = new RestTemplate();
    @GetMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("theDate", new Date());
        return "helloword";
    }
}
