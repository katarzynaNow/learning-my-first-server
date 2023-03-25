package com.example.myfirstserver.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/test")
public class MyFirstController {

    @GetMapping("/first")
    public String first(){
        return "Hello World!";
    }

    @GetMapping("/second")
    public String second(){
        return "Hello World2!";
    }

    // /test/hello/Kasia -> "Hello Kasia"
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "Hello " + name;
    }

    // /test/upper?text=Kasia -> "KASIA"
    @GetMapping("/upper")
    public String upper(@RequestParam String text){
        return text.toUpperCase();
    }

    // http://localhost:8080/test/concat?first=asdf&second=123
    @GetMapping("/concat")
    public String concat(@RequestParam String first, @RequestParam String second){
        return first + second;
    }

    // http://localhost:8080/test/theBiggest?numbers=1&numbers=2&numbers=-5
    @GetMapping("/theBiggest")
    public int theBiggest(@RequestParam List<Integer>numbers) {
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        return numbers.get(0);
    }

    //@RequestParam(required=true) //default
    //@RequestParam(required=false) //attention - null!
    //int vs Integer ( 0 vs null)

    @GetMapping("/authorization")
    public String authorization(@RequestHeader("OurAuthorization") String header) {
        if (header.equals("Secret123")) {
            return "You are logged in";
        } else {
            return "Unauthorized";
        }
    }

    @PostMapping("/reverse")
    public String reverse(@RequestBody String text) {
        StringBuilder sb = new StringBuilder();
        return sb.append(text)
                .reverse()
                .toString();
    }

    public static class User{
        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

    @PostMapping("/user")
    public String user(@RequestBody User user){
        return user.firstName + " " + user.lastName;
    }
}
