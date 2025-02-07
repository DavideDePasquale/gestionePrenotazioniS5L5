package com.epicode.gestionePrenotazioniS5L5.repository;

import com.epicode.gestionePrenotazioniS5L5.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneDAORepository extends JpaRepository<Prenotazione,Long> {

}
