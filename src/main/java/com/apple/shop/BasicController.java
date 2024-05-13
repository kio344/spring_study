package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/")
public class BasicController {

    @GetMapping
    public String hello(){
        return "index.html";
    }

    @GetMapping("/now")
    @ResponseBody
    public LocalDateTime about(){
        LocalDateTime now = LocalDateTime.now();
        return now;
    }
}
