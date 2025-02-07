package com.epicode.gestionePrenotazioniS5L5.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "utenti")
public class Utente {

    @Id
    @GeneratedValue
    private long id;
    @Column(unique = true)
    private String username;
    @Column(nullable = false)
    private String nomeCompleto;
    @Column(nullable = false)
    private String email;
    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> prenotazioneList;

    public Utente(String username, String nomeCompleto, String email, List<Prenotazione> prenotazioneList) {
        this.username = username;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.prenotazioneList = prenotazioneList;
    }
}
