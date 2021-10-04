package com.foodwaste.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodWasteController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
