package com.practice.containers.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SampController {

    @GetMapping(value={"","/","/home"})
    public String displayHome(Model model)
    {
        model.addAttribute("username","Rupesh");
        return "home.html";
    }
}
