package com.example.springmvcdemo3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ScopeController {

    @RequestMapping(value = "/test")
    public String i(HttpServletRequest request){
        request.setAttribute("t","helloworld");
        return "success";
    }
    @RequestMapping("/ModelAndView")
    public ModelAndView ModelAndView(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("t","hello,modelandview");
        mav.setViewName("success");
        return mav;
    }
    @RequestMapping("/testmodel")
    public String testmodel(Model model){
        model.addAttribute("t","hello,model");
        return "success";
    }


}
