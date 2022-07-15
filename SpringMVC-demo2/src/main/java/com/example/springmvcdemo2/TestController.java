package com.example.springmvcdemo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/{id}/{name}")
    public String i(@PathVariable int id, @PathVariable String name, @RequestParam(value = "username") String username, String idd,
                    @RequestHeader(value = "Host") String Host){
        System.out.println(id+" "+name);
        System.out.println(username+" "+idd+" "+Host);
        return "success";
    }


}
