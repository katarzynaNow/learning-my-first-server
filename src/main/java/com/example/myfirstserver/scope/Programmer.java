package com.example.myfirstserver.scope;

import org.springframework.stereotype.Component;

@Component
public class Programmer {

    private Computer computer;
    private CoffeeMachine coffeeMachine;

    public Programmer(Computer computer, CoffeeMachine coffeeMachine) {
        this.computer = computer;
        this.coffeeMachine = coffeeMachine;
    }

    public String work() {
        return computer.work();
    }

    public String drinkCoffee() {
        return coffeeMachine.coffee();
    }
}
