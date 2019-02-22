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
        return "bootcamp";
    }

    @RequestMapping("/authors")
    public String authors(){
        return "author";
    }
    @RequestMapping("/blogposts")
    public String blogposts(){
        return "blogposts";
    }
}



//    @RequestMapping("/jan2819")
//    public String jan2819(){
//        return "jan2819";
//    }
//
//    @RequestMapping("/jan3019")
//    public String jan3019(){
//        return "jan3019";
//    }
//
//    @RequestMapping("/feb0419")
//    public String authors(){
//        return "author";
//    }
//
//    @RequestMapping("/feb0619")
//    public String authors(){
//        return "author";
//    }
//
//    @RequestMapping("/feb1019")
//    public String authors(){
//        return "author";
//    }
//
//    @RequestMapping("/feb1319")
//    public String authors(){
//        return "author";
//    }
//
//    @RequestMapping("/feb1519")
//    public String authors(){
//        return "author";
//    }
//
//    @RequestMapping("/feb1719")
//    public String authors(){
//        return "author";
//    }
//
//    @RequestMapping("/feb1919")
//    public String authors(){
//        return "author";
//    }
//
//    @RequestMapping("/feb2019")
//    public String feb2019(){
//        return "feb2019";
//    }
//}
