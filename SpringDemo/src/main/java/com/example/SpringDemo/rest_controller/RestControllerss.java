package com.example.SpringDemo.rest_controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
//Rest Controller Class
public class RestControllerss {
    //UC01 : GET Request from /getHello Path by using STS thing.
    @GetMapping("/getHello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }


    //UC03 : GET Request from /get path.
    @GetMapping("/get")
    public String getHello() {
        return "Hello from BridgeLabzz";
    }
}