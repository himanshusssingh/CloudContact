package com.cloudContact.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("----------Home page handler-----------");
        model.addAttribute("name", "Himanshu Singh" );
        model.addAttribute("age", "20");
        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        System.out.println("-----------About Page Handler----------");
        return "about";
    }
}
