package com.example.myfirstserver.crudPerson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping
    public List<Person> list(){
        return service.list();
    }

    @GetMapping("/{id}")
    public Person get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    public Person create (@RequestBody Person person) {
        return service.create(person);
    }

    @PutMapping
    public Person update (@RequestBody Person person) {
        return service.update(person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

}
