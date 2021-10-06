package com.foodwaste.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodWasteController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/info")
    public String info(){
        return "info";
    }

    @GetMapping("/find-food")
    public String findFood(){
        return "find-food";
    }

    @GetMapping("/sign-up")
    public String signUp(){
        return "sign-up";
    }

    @GetMapping("/faq")
    public String faq(){
        return "faq";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
