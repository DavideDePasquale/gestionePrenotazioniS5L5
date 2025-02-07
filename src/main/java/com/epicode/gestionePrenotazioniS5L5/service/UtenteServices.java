package com.epicode.gestionePrenotazioniS5L5.service;

import com.epicode.gestionePrenotazioniS5L5.model.Utente;
import com.epicode.gestionePrenotazioniS5L5.repository.UtenteDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UtenteServices {
    @Autowired UtenteDAORepository utenteDB;

    @Autowired @Qualifier("utente") ObjectProvider<Utente> utenteProvider;

    public Utente createUtente(){
        return utenteProvider.getObject();
    }

    //jpa method
    public void insertUtente(Utente utente){
        utenteDB.save(utente);
        System.out.println("🎆 Utente aggiunto correttamente nel DB 🎆");
    }
}
