package com.epicode.gestionePrenotazioniS5L5.model;

import com.epicode.gestionePrenotazioniS5L5.enumeration.TipoPostazione;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "postazioni")
public class Postazione {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = true)
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;
    private Integer numero_max_occupanti;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn( name =  "edificio_id")
    private Edificio edificio;
    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazioneList;

    public Postazione(String descrizione, TipoPostazione tipoPostazione, Integer numero_max_occupanti, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.numero_max_occupanti = numero_max_occupanti;
        this.edificio = edificio;
        this.prenotazioneList = prenotazioneList;
    }

    public Postazione(String descrizione, TipoPostazione tipoPostazione, Integer numero_max_occupanti) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.numero_max_occupanti = numero_max_occupanti;
    }

    public void addPrenotazione(Prenotazione prenotazione){
        this.prenotazioneList.add(prenotazione);
    }
    public void addEdificio(Edificio edificio){
        this.edificio.getId();
    }
}
