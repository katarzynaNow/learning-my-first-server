package com.example.myfirstserver.configuration;

import java.util.List;

public interface Wybieg {

    List<Gromada> wybiegDla();

    default boolean dodajZwierze(Zwierze zwierze) {
        return wybiegDla().contains(zwierze.gromada());
    }

}
