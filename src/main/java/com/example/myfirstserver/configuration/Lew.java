package com.example.myfirstserver.configuration;

public class Lew implements Zwierze{

    @Override
    public Gromada gromada() {
        return Gromada.SSAK;
    }

    @Override
    public String nazwa() {
        return "Lew";
    }

}
