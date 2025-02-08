package com.epicode.gestionePrenotazioniS5L5.service;

import com.epicode.gestionePrenotazioniS5L5.model.Postazione;
import com.epicode.gestionePrenotazioniS5L5.model.Prenotazione;
import com.epicode.gestionePrenotazioniS5L5.repository.PrenotazioneDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PrenotazioniServices {

    @Autowired PrenotazioneDAORepository prenotazioneDB;

     @Autowired @Qualifier("prenotazione1") ObjectProvider<Prenotazione> prenotazione1Provider;
     @Autowired @Qualifier("prenotazione2") ObjectProvider<Prenotazione> prenotazione2Provider;
     @Autowired @Qualifier("prenotazione3") ObjectProvider<Prenotazione> prenotazione3Provider;
     @Autowired @Qualifier("prenotazione4chenonva") ObjectProvider<Prenotazione> prenotazione4Provider;


     public Prenotazione createPrenotazione1(){
         return prenotazione1Provider.getObject();
     }
     public Prenotazione createPrenotazione2(){
         return  prenotazione2Provider.getObject();
     }
     public Prenotazione createPrenotazione3(){
         return  prenotazione3Provider.getObject();
     }
     public Prenotazione createPrenotazione4chenonva(){
         return prenotazione4Provider.getObject();
     }

    //jpa method
    public Prenotazione insertPrenotazione(Prenotazione prenotazione){
         boolean prenotazioneEsistente = prenotazioneDB.existsByGiornoPrenotazioneAndPostazione(prenotazione.getGiornoPrenotazione(),prenotazione.getPostazione());
         if(prenotazioneEsistente){
             System.out.println("⚠️⚠️Impossibile salvare questa prenotazione perchè orario e postazione già occupati.⚠️⚠️");
             return null;
         } else {
             System.out.println("☑️ Prenotazione aggiunta correttamente nel DB ☑️");
            return prenotazioneDB.save(prenotazione);
         }
    }
//    public boolean isDisponibile(Postazione postazione,LocalDateTime orarioegiornoprenotazione){
//       return !prenotazioneDB.existByPostazioneAndGiornoPrenotazione(postazione,orarioegiornoprenotazione);
//    }
}
