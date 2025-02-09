package com.epicode.gestionePrenotazioniS5L5.repository;

import com.epicode.gestionePrenotazioniS5L5.enumeration.TipoPostazione;
import com.epicode.gestionePrenotazioniS5L5.model.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneDAORepository extends JpaRepository<Postazione,Long> {
    Postazione findById(long id);
    @Query("SELECT p FROM Postazione p JOIN FETCH p.edificio e WHERE p.tipoPostazione = :postazione AND e.citta = :nomeCitta")
    List<Postazione> findPostazioniByTipoAndCitta(@Param("postazione") TipoPostazione postazione, @Param("nomeCitta") String nomeCitta); // il nome della città ce l'ho in Edificio, non sapevo come gestirla quindi ho fatto una query personalizzata

}
