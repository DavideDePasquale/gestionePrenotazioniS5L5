package com.epicode.gestionePrenotazioniS5L5.service;

import com.epicode.gestionePrenotazioniS5L5.model.Prenotazione;
import com.epicode.gestionePrenotazioniS5L5.repository.PrenotazioneDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioniServices {

    @Autowired PrenotazioneDAORepository prenotazioneDB;




    //jpa method
    public void insertPrenotazione(Prenotazione prenotazione){
        prenotazioneDB.save(prenotazione);
        System.out.println("☑️ Prenotazione aggiunta correttamente nel DB ☑️");
    }
}
