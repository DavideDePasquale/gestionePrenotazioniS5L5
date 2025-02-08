package com.epicode.gestionePrenotazioniS5L5.repository;

import com.epicode.gestionePrenotazioniS5L5.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteDAORepository extends JpaRepository<Utente,Long> {
    Utente findByUsername(String username);
}
