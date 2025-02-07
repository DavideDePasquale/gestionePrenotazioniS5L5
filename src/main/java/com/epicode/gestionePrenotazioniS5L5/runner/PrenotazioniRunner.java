package com.epicode.gestionePrenotazioniS5L5.runner;

import com.epicode.gestionePrenotazioniS5L5.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PrenotazioniRunner implements CommandLineRunner {

    @Autowired private PrenotazioneService prenotazioneService;

    @Override
    public void run(String... args) throws Exception {

    }
}
