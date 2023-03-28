package com.example.myfirstserver.configuration;

public class Krokodyl implements Zwierze{

    @Override
    public Gromada gromada() {
        return Gromada.GAD;
    }

    @Override
    public String nazwa() {
        return "Krokodyl";
    }

}
