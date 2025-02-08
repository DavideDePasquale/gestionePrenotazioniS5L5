package com.epicode.gestionePrenotazioniS5L5.service;

import com.epicode.gestionePrenotazioniS5L5.model.Edificio;
import com.epicode.gestionePrenotazioniS5L5.model.Postazione;
import com.epicode.gestionePrenotazioniS5L5.repository.EdificioDAORepository;
import com.epicode.gestionePrenotazioniS5L5.repository.PostazioneDAORepository;
import com.epicode.gestionePrenotazioniS5L5.repository.PrenotazioneDAORepository;
import com.epicode.gestionePrenotazioniS5L5.repository.UtenteDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PostazioneServices {


    @Autowired PostazioneDAORepository postazioneDB;

    //azienda epicode
    @Autowired @Qualifier("postazione1Epicode") ObjectProvider<Postazione> postazione1EpicodeProvider;
    @Autowired @Qualifier("postazione2Epicode") ObjectProvider<Postazione> postazione2EpicodeProvider;
    @Autowired @Qualifier("postazione3Epicode") ObjectProvider<Postazione> postazione3EpicodeProvider;
    @Autowired @Qualifier("postazione4Epicode") ObjectProvider<Postazione> postazione4EpicodeProvider;
    //azienda aon
    @Autowired @Qualifier("postazione1AON") ObjectProvider<Postazione> postazione1AONProvider;
    @Autowired @Qualifier("postazione2AON") ObjectProvider<Postazione> postazione2AONProvider;
    @Autowired @Qualifier("postazione3AON") ObjectProvider<Postazione> postazione3AONProvider;
    @Autowired @Qualifier("postazione4AON") ObjectProvider<Postazione> postazione4AONProvider;
    //azienda juventus
    @Autowired @Qualifier("postazione1Juventus") ObjectProvider<Postazione> postazione1JuventusProvider;
    @Autowired @Qualifier("postazione2Juventus") ObjectProvider<Postazione> postazione2JuventusProvider;
    @Autowired @Qualifier("postazione3Juventus") ObjectProvider<Postazione> postazione3JuventusProvider;
    @Autowired @Qualifier("postazione4Juventus") ObjectProvider<Postazione> postazione4JuventusProvider;
    //azienda amazon
    @Autowired @Qualifier("postazione1Amazon") ObjectProvider<Postazione> postazione1AmazonProvider;
    @Autowired @Qualifier("postazione2Amazon") ObjectProvider<Postazione> postazione2AmazonProvider;
    @Autowired @Qualifier("postazione3Amazon") ObjectProvider<Postazione> postazione3AmazonProvider;
    @Autowired @Qualifier("postazione4Amazon") ObjectProvider<Postazione> postazione4AmazonProvider;


    // POSTAZIONI :
    // - EPICODE
    public Postazione createPostazione1Epicode(){
        return postazione1EpicodeProvider.getObject();
    }
    public Postazione createPostazione2Epicode(){
        return  postazione2EpicodeProvider.getObject();
    }
    public Postazione createPostazione3Epicode(){
        return postazione3EpicodeProvider.getObject();
    }
    public Postazione createPostazione4Epicode(){
        return  postazione4EpicodeProvider.getObject();
    }
    // - AON
    public Postazione createPostazione1AON(){
        return postazione1AONProvider.getObject();
    }
    public Postazione createPostazione2AON(){
        return  postazione2AONProvider.getObject();
    }
    public Postazione createPostazione3AON(){
        return postazione3AONProvider.getObject();
    }
    public Postazione createPostazione4AON(){
        return  postazione4AONProvider.getObject();
    }
    // - JUVENTUS
    public Postazione createPostazione1Juventus(){
        return postazione1JuventusProvider.getObject();
    }
    public Postazione createPostazione2Juventus(){
        return  postazione2JuventusProvider.getObject();
    }
    public Postazione createPostazione3Juventus(){
        return postazione3JuventusProvider.getObject();
    }
    public Postazione createPostazione4Juventus(){
        return  postazione4JuventusProvider.getObject();
    }
    // - AMAZON
    public Postazione createPostazione1Amazon(){
        return postazione1AmazonProvider.getObject();
    }
    public Postazione createPostazione2Amazon(){
        return  postazione2AmazonProvider.getObject();
    }
    public Postazione createPostazione3Amazon(){
        return postazione3AmazonProvider.getObject();
    }
    public Postazione createPostazione4Amazon(){
        return  postazione4AmazonProvider.getObject();
    }


   //jpa method
    public void insertPostazione(Postazione postazione){
        postazioneDB.save(postazione);
        System.out.println("🎉 Postazione aggiunta correttamente nel DB 🎉");
    }


}
