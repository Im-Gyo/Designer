package com.gsb.web.designer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class IndexController {
    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView ModelAndView = new ModelAndView();
        ModelAndView.setViewName("index");

        return ModelAndView;
    }
}
