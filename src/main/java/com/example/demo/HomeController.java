package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/bootcamp")
    public String bootcamp(){
        return "authors";
    }

    @RequestMapping("/authors")
    public String authors(){
        return "bootcamp";
    }
}
