package com.example.myfirstserver.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator2")
public class Calculator2Controller {

    /**
     * POST /calculator2/count
     * <p>
     * {
     * "a" : 123
     * "b" : 90
     * "operation" : "ADD"//ADD, DEDUCT, MULTIPLY, DIVIDE, POWER
     * }
     */

    enum Operation {
        ADD,
        DEDUCT,
        MULTIPLY,
        DIVIDE,
        POWER
    }

    public static class Count {
        int a;
        int b;
        Operation operation;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public Operation getOperation() {
            return operation;
        }

        public void setOperation(Operation operation) {
            this.operation = operation;
        }

    }

    @PostMapping("/count")
    public int count(@RequestBody Count count) {
        switch (count.operation) {
            case ADD:
                return count.a + count.b;
            case DEDUCT:
                return count.a - count.b;
            case DIVIDE:
                return count.a / count.b;
            case MULTIPLY:
                return count.a * count.b;
            case POWER:
                return (int) Math.pow(count.a, count.b);
            default:
                return 0;
        }
    }
}
