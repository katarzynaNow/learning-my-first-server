package com.example.myfirstserver.crudProfile;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProfileService {

    private Map<Integer, Profile> repo= new HashMap<>();

    private int newId(){
        return new Random().nextInt();
    }

    public Profile create (Profile newProfile){
        newProfile.setId(newId());
        repo.put(newProfile.getId(), newProfile);
        return newProfile;
    }

    public List<Profile> list (){
        return new ArrayList<>(repo.values());
    }

    public Profile get (int id) {
        return repo.get(id);
    }

    public Profile update (Profile toUpdate){
        if (repo.containsKey(toUpdate.getId())){
            repo.put(toUpdate.getId(), toUpdate);
            return toUpdate;
        }
        return null;
    }

    public void delete(int id) {
        repo.remove(id);
    }
}
