package com.example.myfirstserver.crudPerson;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class PersonService {

    private Map<String, Person> repo= new HashMap<>();

    //CRUD -> create, read, update, delete

    private String getNewId(){
        LocalDateTime now = LocalDateTime.now();
        StringBuilder sb = new StringBuilder();
        return sb.append(now.getYear())
                .append( now.getMonthValue())
                .append(now.getDayOfMonth())
                .append(new Random().nextInt(10000, 99999))
                .toString();
    }

    public Person create(Person newPerson){
        newPerson.setId(getNewId());
        repo.put(newPerson.getId(), newPerson);
        return newPerson;
    }

    public List<Person> list(){
        return new ArrayList<>(repo.values());
    }

    public Person get(String id){
        return repo.get(id);
    }

    public Person update (Person toUpdate) {
        if (repo.containsKey(toUpdate.getId())) {
            repo.put(toUpdate.getId(), toUpdate);
            return toUpdate;
        }
        return null;
    }

    public void delete(String id) {
        repo.remove(id);
    }

}
