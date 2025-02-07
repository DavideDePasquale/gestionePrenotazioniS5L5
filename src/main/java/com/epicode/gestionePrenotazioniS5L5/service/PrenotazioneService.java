package com.epicode.gestionePrenotazioniS5L5.service;

import com.epicode.gestionePrenotazioniS5L5.model.Edificio;
import com.epicode.gestionePrenotazioniS5L5.repository.EdificioDAORepository;
import com.epicode.gestionePrenotazioniS5L5.repository.PostazioneDAORepository;
import com.epicode.gestionePrenotazioniS5L5.repository.PrenotazioneDAORepository;
import com.epicode.gestionePrenotazioniS5L5.repository.UtenteDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneService {


    @Autowired EdificioDAORepository edificioDB;
    @Autowired PostazioneDAORepository postazioneDB;
    @Autowired PrenotazioneDAORepository prenotazioneDB;
    @Autowired UtenteDAORepository utenteDB;


    @Autowired @Qualifier("edificioEpicode") ObjectProvider<Edificio> edificioEpicodeProvider;
    @Autowired @Qualifier("edificioAON") ObjectProvider<Edificio> edificioAONProvider;
    @Autowired @Qualifier("edificioJuventus") ObjectProvider<Edificio> edificioJuventusProvider;
    @Autowired @Qualifier("edificioAmazon") ObjectProvider<Edificio> edificioAmazonProvider;


}
