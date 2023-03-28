package com.example.myfirstserver.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Zoo {
    @Bean
    public Zwierze lew(@Qualifier("sawanna") Wybieg wybieg) {
        Zwierze zwierze = new Lew();
        if (!wybieg.dodajZwierze(zwierze)) {
            throw new RuntimeException("Zly wybieg");
        }
        return zwierze;
    }
    @Bean
    public Zwierze pelikan(@Qualifier("klatka") Wybieg wybieg) {
        Zwierze zwierze = new Pelikan();
        if (!wybieg.dodajZwierze(zwierze)) {
            throw new RuntimeException("Zly wybieg");
        }
        return zwierze;
    }
    @Bean
    public Zwierze krokodyl(@Qualifier("junglaZWoda") Wybieg wybieg) {
        Zwierze zwierze = new Krokodyl();
        if (!wybieg.dodajZwierze(zwierze)) {
            throw new RuntimeException("Zly wybieg");
        }
        return zwierze;
    }
    @Bean
    public Zwierze zaba(@Qualifier("junglaZWoda") Wybieg wybieg) {
        Zwierze zwierze = new Zaba();
        if (!wybieg.dodajZwierze(zwierze)) {
            throw new RuntimeException("Zly wybieg");
        }
        return zwierze;
    }

}
