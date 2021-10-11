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

    @GetMapping("/searched-food")
    public String searchedFood(){
        return "searched-food";
    }

    @GetMapping("/sign-up")
    public String signUp(){
        return "sign-up";
    }

    @GetMapping("/sign-up-conf")
    public String signUpConf(){
        return "sign-up-conf";
    }

    @GetMapping("/faq")
    public String faq(){
        return "faq";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/contact-conf")
    public String contactConf(){
        return "contact-conf";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }


}
