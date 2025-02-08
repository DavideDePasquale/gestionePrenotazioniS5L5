package com.epicode.gestionePrenotazioniS5L5.repository;

import com.epicode.gestionePrenotazioniS5L5.model.Postazione;
import com.epicode.gestionePrenotazioniS5L5.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Repository
public interface PrenotazioneDAORepository extends JpaRepository<Prenotazione,Long> {

    boolean existsByGiornoPrenotazioneAndPostazione(LocalDateTime giornoPrenotazione,Postazione postazione);
}
