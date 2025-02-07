package com.epicode.gestionePrenotazioniS5L5.service;

import com.epicode.gestionePrenotazioniS5L5.model.Edificio;
import com.epicode.gestionePrenotazioniS5L5.model.Postazione;
import com.epicode.gestionePrenotazioniS5L5.model.Prenotazione;
import com.epicode.gestionePrenotazioniS5L5.model.Utente;
import com.epicode.gestionePrenotazioniS5L5.repository.EdificioDAORepository;
import com.epicode.gestionePrenotazioniS5L5.repository.PostazioneDAORepository;
import com.epicode.gestionePrenotazioniS5L5.repository.PrenotazioneDAORepository;
import com.epicode.gestionePrenotazioniS5L5.repository.UtenteDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EdificioServices {


    @Autowired EdificioDAORepository edificioDB;
    @Autowired PostazioneDAORepository postazioneDB;
    @Autowired PrenotazioneDAORepository prenotazioneDB;
    @Autowired UtenteDAORepository utenteDB;


    @Autowired @Qualifier("edificioEpicode") ObjectProvider<Edificio> edificioEpicodeProvider;
    @Autowired @Qualifier("edificioAON") ObjectProvider<Edificio> edificioAONProvider;
    @Autowired @Qualifier("edificioJuventus") ObjectProvider<Edificio> edificioJuventusProvider;
    @Autowired @Qualifier("edificioAmazon") ObjectProvider<Edificio> edificioAmazonProvider;



    public Edificio createEdificioEpicode(){
        return edificioEpicodeProvider.getObject();
    }
    public Edificio createEdificioAON(){
        return edificioAONProvider.getObject();
    }
    public Edificio createEdificioJuventus(){
        return edificioJuventusProvider.getObject();
    }
    public Edificio createEdificioAmazon(){
        return edificioAmazonProvider.getObject();
    }


     // jpa method :
    public void insertEdificio(Edificio edificio){
        edificioDB.save(edificio);
        System.out.println("🥳 Edificio aggiunto nel DB 🥳");
    }

}
