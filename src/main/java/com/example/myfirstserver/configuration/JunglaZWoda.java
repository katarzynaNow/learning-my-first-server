package com.example.myfirstserver.configuration;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class JunglaZWoda implements Wybieg{

    @Override
    public List<Gromada> wybiegDla() {
        return Arrays.asList(Gromada.GAD, Gromada.PLAZ);
    }

}
