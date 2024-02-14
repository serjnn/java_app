package com.tester.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;



@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Sergey");
        model.addAttribute("age", 17);
        return "homepage";
//        fdfdffdfsdfdsfdsffsfsfsffdsfdsf

    }


}
