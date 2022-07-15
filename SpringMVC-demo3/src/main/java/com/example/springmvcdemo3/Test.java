package com.example.springmvcdemo3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
    @RequestMapping(value = "/")
    public String i(){
        return "index";
    }
}
