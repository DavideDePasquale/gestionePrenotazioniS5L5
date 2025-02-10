package com.epicode.gestionePrenotazioniS5L5.runner;

import com.epicode.gestionePrenotazioniS5L5.enumeration.TipoPostazione;
import com.epicode.gestionePrenotazioniS5L5.model.Edificio;
import com.epicode.gestionePrenotazioniS5L5.model.Postazione;
import com.epicode.gestionePrenotazioniS5L5.model.Prenotazione;
import com.epicode.gestionePrenotazioniS5L5.model.Utente;
import com.epicode.gestionePrenotazioniS5L5.service.EdificioServices;
import com.epicode.gestionePrenotazioniS5L5.service.PostazioneServices;
import com.epicode.gestionePrenotazioniS5L5.service.PrenotazioniServices;
import com.epicode.gestionePrenotazioniS5L5.service.UtenteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PrenotazioniRunner implements CommandLineRunner {

    @Autowired private EdificioServices edificioServices;
    @Autowired private PostazioneServices postazioneServices;
    @Autowired private UtenteServices utenteServices;
    @Autowired private PrenotazioniServices prenotazioniServices;

    @Override
    public void run(String... args) throws Exception {
            // MI CREDO PRIMA DEGLI EDIFICI SU CUI DOPO MI CREDO QUALCHE POSTAZIONE
//        Edificio e1 = edificioServices.createEdificioEpicode();
//        Edificio e2= edificioServices.createEdificioAmazon();
//        Edificio e3= edificioServices.createEdificioJuventus();
//        Edificio e4 = edificioServices.createEdificioAON();
//        edificioServices.insertEdificio(e4);


            // aggiungo l'Edificio nel db

//          prenotazioneService.insertEdificio(e1);
//        Postazione p = postazioneServices.createPostazione4Juventus();
//        postazioneServices.insertPostazione(p);


        // mi credo un po di utenti

//            Utente u = utenteServices.createUtente();
//            utenteServices.insertUtente(u);

        // mi creo le prenotazioni

//        Prenotazione p = prenotazioniServices.createPrenotazione1();
//        prenotazioniServices.insertPrenotazione(p);

//        Prenotazione p = prenotazioniServices.createPrenotazione2();
//        prenotazioniServices.insertPrenotazione(p);

//          Prenotazione p = prenotazioniServices.createPrenotazione3();
//          prenotazioniServices.insertPrenotazione(p);


        // Mi credo una prenotazione nello stesso orario e nella stessa postazione di un'altra prenotazione!
//        Prenotazione p = prenotazioniServices.createPrenotazione4chenonva();
//        prenotazioniServices.insertPrenotazione(p);

        //mi ricerco le postazioni in base alla città e al tipo di postazione 🎆🥳
//         List<Postazione> postazioniXCitta = postazioneServices.returnPostazioniXCitta(TipoPostazione.OPENSPACE,"Roma");
//        postazioniXCitta.forEach(System.out::println);

    }
}
