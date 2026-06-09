package com.cloudContact.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cloudContact.manager.form.UserForm;

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

    @GetMapping("/signup")
    public String signup() {
        System.out.println("-----------Signup Page Handler----------");
        return "signup";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String signupHandler(@ModelAttribute UserForm userForm) {
        System.out.println("-----------Signup Handler----------");
        System.out.println(userForm);
        return "redirect:/home";
    }

}
