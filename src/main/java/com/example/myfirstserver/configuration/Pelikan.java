package com.example.myfirstserver.configuration;

public class Pelikan implements Zwierze{

    @Override
    public Gromada gromada() {
        return Gromada.PTAK;
    }

    @Override
    public String nazwa() {
        return "Pelikan";
    }

}
