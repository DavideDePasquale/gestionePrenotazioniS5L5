package com.epicode.gestionePrenotazioniS5L5.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "prenotazioni")
public class Prenotazione {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "giorno_prenotazione", nullable = false)
    private LocalDateTime giornoPrenotazione;
    @ManyToOne(cascade = CascadeType.MERGE) //gli utenti possono fare più prenotazioni, quindi many to one
    private Utente utente;
    @ManyToOne(cascade = CascadeType.MERGE) //le postazioni possono avere più prenotazioni (ad esempio una il 7/2 e una l'8/2.. ma sostanzialmente sono 2 prenotazioni differenti per la stessa postazione.
    private Postazione postazione;

    public Prenotazione(LocalDateTime giornoPrenotazione, Utente utente, Postazione postazione) {
        this.giornoPrenotazione = giornoPrenotazione;
        this.utente = utente;
        this.postazione = postazione;
    }

    public Prenotazione(LocalDateTime giornoPrenotazione) {
        this.giornoPrenotazione = giornoPrenotazione;
    }
}
