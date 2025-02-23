package com.example.SpringDemo.ui_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
//UI Controller Class
public class UIController {
    //UC02 : GET Request for the response of UI page.
    @GetMapping("/getUI")
    public String sayHello(Model model) {
        model.addAttribute("message","Hello from Bridelabzz (HTML Page)");
        return "hello";
    }
}