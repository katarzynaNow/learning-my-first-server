package com.example.myfirstserver.scope;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
@Component
public class CoffeeMachine {

    private final int number = new SecureRandom().nextInt() & 100;

    public String coffee() {
        return "Coffee machine : " + number;
    }
}
