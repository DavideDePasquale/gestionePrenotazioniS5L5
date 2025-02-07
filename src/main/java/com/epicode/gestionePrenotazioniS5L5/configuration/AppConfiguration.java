package com.epicode.gestionePrenotazioniS5L5.configuration;

import com.epicode.gestionePrenotazioniS5L5.enumeration.TipoPostazione;
import com.epicode.gestionePrenotazioniS5L5.model.Edificio;
import com.epicode.gestionePrenotazioniS5L5.model.Postazione;
import com.epicode.gestionePrenotazioniS5L5.model.Utente;
import com.epicode.gestionePrenotazioniS5L5.repository.EdificioDAORepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Locale;

@Configuration
@PropertySource("application.properties")
public class AppConfiguration {
    Faker fake = new Faker(Locale.ITALY);
    @Autowired  EdificioDAORepository edificioDAORepository;

    //BEAN PER LA CREAZIONE DEGLI EDIFICI
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
         // BEAN PER LA CREAZIONE DELLE POSTAZIONI DELLE VARIE AZIENDE.
         // CREO POSTAZIONI PER L'AZIENDA EPICODE:
    @Bean
    public Postazione postazione1Epicode(){
        Edificio edificioEpicode = edificioDAORepository.findByNome("Epicode Finance");
        if(edificioEpicode == null) {
            throw new RuntimeException("Edificio Epicode Finance non trovato");
        }
        Postazione p = new Postazione("Postazione Reclami", TipoPostazione.PRIVATO,2);
        p.setEdificio(edificioEpicode);
        return p;
    }
    @Bean
    public Postazione postazione2Epicode(){
        Edificio edificioEpicode = edificioDAORepository.findByNome("Epicode Finance");
        if(edificioEpicode == null) {
            throw new RuntimeException("Edificio Epicode Finance non trovato");
        }
        Postazione p = new Postazione("Postazione Affari",TipoPostazione.OPENSPACE,3);
        p.setEdificio(edificioEpicode);
        return p;
    }
    @Bean
    public Postazione postazione3Epicode(){
        Edificio edificioEpicode = edificioDAORepository.findByNome("Epicode Finance");
        if(edificioEpicode == null) {
            throw new RuntimeException("Edificio Epicode Finance non trovato");
        }
        Postazione p = new Postazione("Postazione Info",TipoPostazione.PRIVATO,4);
        p.setEdificio(edificioEpicode);
        return p;
    }
    @Bean
    public Postazione postazione4Epicode(){
        Edificio edificioEpicode = edificioDAORepository.findByNome("Epicode Finance");
        if(edificioEpicode == null) {
            throw new RuntimeException("Edificio Epicode Finance non trovato");
        }
        Postazione p = new Postazione("Postazione Riunioni",TipoPostazione.SALA_RIUNIONI,10);
        p.setEdificio(edificioEpicode);
        return p;
    }
    // CREO POSTAZIONI PER L'AZIENDA AON :

    @Bean
    public Postazione postazione1AON(){
        Edificio edificioAON = edificioDAORepository.findByNome("AON Finance");
        if(edificioAON== null) {
            throw new RuntimeException("Edificio AON Finance non trovato");
        }
        Postazione p = new Postazione("Postazione Reclami", TipoPostazione.PRIVATO,2);
        p.setEdificio(edificioAON);
        return p;
    }
    @Bean
    public Postazione postazione2AON(){
        Edificio edificioAON = edificioDAORepository.findByNome("AON Finance");
        if(edificioAON== null) {
            throw new RuntimeException("Edificio AON Finance non trovato");
        }
        Postazione p = new Postazione("Postazione Affari",TipoPostazione.OPENSPACE,3);
        p.setEdificio(edificioAON);
        return p;
    }
    @Bean
    public Postazione postazione3AON(){
        Edificio edificioAON = edificioDAORepository.findByNome("AON Finance");
        if(edificioAON== null) {
            throw new RuntimeException("Edificio AON Finance non trovato");
        }
        Postazione p = new Postazione("Postazione Info",TipoPostazione.PRIVATO,4);
        p.setEdificio(edificioAON);
        return p;
    }
    @Bean
    public Postazione postazione4AON(){
        Edificio edificioAON = edificioDAORepository.findByNome("AON Finance");
        if(edificioAON== null) {
            throw new RuntimeException("Edificio AON Finance non trovato");
        }
        Postazione p = new Postazione("Postazione Riunioni",TipoPostazione.SALA_RIUNIONI,10);
        p.setEdificio(edificioAON);
        return p;
    }
      // CREO POSTAZIONI PER L'AZIENDA JUVENTUS :

    @Bean
    public Postazione postazione1Juventus(){
        Edificio edificioJuventus = edificioDAORepository.findByNome("Juventus Finance");
        if(edificioJuventus== null) {
            throw new RuntimeException("❌Edificio Juventus Finance non trovato❌");
        }
          Postazione p = new Postazione("Postazione Reclami", TipoPostazione.PRIVATO,2);
        p.setEdificio(edificioJuventus);
          return p;
    }
    @Bean
    public Postazione postazione2Juventus(){
        Edificio edificioJuventus = edificioDAORepository.findByNome("Juventus Finance");
        if(edificioJuventus== null) {
            throw new RuntimeException("❌Edificio Juventus Finance non trovato❌");
        }
        Postazione p = new Postazione("Postazione Affari",TipoPostazione.OPENSPACE,3);
        p.setEdificio(edificioJuventus);
        return p;
    }
    @Bean
    public Postazione postazione3Juventus(){
        Edificio edificioJuventus = edificioDAORepository.findByNome("Juventus Finance");
        if(edificioJuventus== null) {
            throw new RuntimeException("❌Edificio Juventus Finance non trovato❌");
        }
        Postazione p = new Postazione("Postazione Info",TipoPostazione.PRIVATO,4);
        p.setEdificio(edificioJuventus);
        return p;
    }
    @Bean
    public Postazione postazione4Juventus(){
        Edificio edificioJuventus = edificioDAORepository.findByNome("Juventus Finance");
        if(edificioJuventus== null) {
            throw new RuntimeException("❌Edificio Juventus Finance non trovato❌");
        }
        Postazione p = new Postazione("Postazione Riunioni",TipoPostazione.SALA_RIUNIONI,10);
        p.setEdificio(edificioJuventus);
        return p;
    }
      // CREO POSTAZIONI PER L'AZIENDA AMAZON :
    @Bean
    public Postazione postazione1Amazon(){
        Edificio edificioAmazon = edificioDAORepository.findByNome("Amazon Finance");
        if(edificioAmazon== null) {
            throw new RuntimeException("❌Edificio Amazon Finance non trovato❌");
        }
          Postazione p = new Postazione("Postazione Reclami", TipoPostazione.PRIVATO,2);
        p.setEdificio(edificioAmazon);
          return p;
    }
    @Bean
    public Postazione postazione2Amazon(){
        Edificio edificioAmazon = edificioDAORepository.findByNome("Amazon Finance");
        if(edificioAmazon== null) {
            throw new RuntimeException("❌Edificio Amazon Finance non trovato❌");
        }
        Postazione p = new Postazione("Postazione Affari",TipoPostazione.OPENSPACE,3);
        p.setEdificio(edificioAmazon);
        return p;
    }
    @Bean
    public Postazione postazione3Amazon(){
        Edificio edificioAmazon = edificioDAORepository.findByNome("Amazon Finance");
        if(edificioAmazon== null) {
            throw new RuntimeException("❌Edificio Amazon Finance non trovato❌");
        }
        Postazione p = new Postazione("Postazione Info",TipoPostazione.PRIVATO,4);
        p.setEdificio(edificioAmazon);
        return p;
    }
    @Bean
    public Postazione postazione4Amazon(){
        Edificio edificioAmazon = edificioDAORepository.findByNome("Amazon Finance");
        if(edificioAmazon== null) {
            throw new RuntimeException("❌Edificio Amazon Finance non trovato❌");
        }
        Postazione p = new Postazione("Postazione Riunioni",TipoPostazione.SALA_RIUNIONI,10);
       p.setEdificio(edificioAmazon);
        return p;
    }
      // MI CREO GLI UTENTI
    @Bean
    public Utente utente(){
        return new Utente(fake.name().username(),fake.name().fullName(),fake.internet().emailAddress());
    }


}
