package com.example.myfirstserver.crudProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @Autowired
    private ProfileService service;

    @GetMapping
    public List<Profile> list(){
        return service.list();
    }

    @GetMapping("/{id}")
    public Profile get(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping
    public Profile create (@RequestBody Profile profile){
        return service.create(profile);
    }

    @PutMapping
    public Profile update (@RequestBody Profile profile) {
        return service.update(profile);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
