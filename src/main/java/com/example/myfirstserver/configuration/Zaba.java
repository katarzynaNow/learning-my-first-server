package com.example.myfirstserver.configuration;

public class Zaba implements Zwierze{

    @Override
    public Gromada gromada() {
        return Gromada.PLAZ;
    }

    @Override
    public String nazwa() {
        return "Zaba";
    }

}
