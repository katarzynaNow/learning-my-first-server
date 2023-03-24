package com.example.myfirstserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    // /calculator/add/1/2
    @GetMapping("/add/{a}/{b}")
    public int add (@PathVariable int a, @PathVariable int b){
        return a + b;
    }

    // /calculator/deduct/1/2
    @GetMapping("/deduct/{a}/{b}")
    public int deduct (@PathVariable int a, @PathVariable int b){
        return a - b;
    }

    // /calculator/multiply/1/2
    @GetMapping("/multiply/{a}/{b}")
    public int multiply (@PathVariable int a, @PathVariable int b){
        return a * b;
    }

    // /calculator/divide/1/2
    @GetMapping("/divide/{a}/{b}")
    public float divide (@PathVariable int a, @PathVariable int b){
        return a / (float) b;
    }
}
