package com.example.myfirstserver.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Component
@Scope(SCOPE_PROTOTYPE)
public class Computer {

    private boolean occupied = false;

    public String work() {
        if (occupied) {
            return "Occupied";
        } else {
            occupied = true;
            return "Able to work";
        }
    }

}
