package com.epicode.gestionePrenotazioniS5L5.configuration;

import com.epicode.gestionePrenotazioniS5L5.model.Edificio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class AppConfiguration {

    @Bean
    public Edificio edificioEpicode(){
        return new Edificio("Epicode Finance","Via dei Magazzini Generali, 16","Roma");
    }

    @Bean
    public Edificio edificioAON(){
        return new Edificio("AON Finance", "Via E. Calindri, 6","Milano");
    }

    @Bean
    public Edificio edificioJuventus(){
        return new Edificio("Juventus Finance","Via Gianni Angnelli, 12","Torino");
    }

    @Bean
    public Edificio edificioAmazon(){
        return new Edificio("Amazon Finance","Via Monte Grappa, 3","Milano");
    }

}
