package com.aseds.costats.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Evenement {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="idCooperative")
    private Cooperative cooperative;

    @ManyToOne
    @JoinColumn(name="idVille")
    private Ville ville;

    @Column(name="sujetEvenement")
    private String sujetEvenement;

    @Column(name="dateDebut")
    private Date dateDebut;

    @Column(name="dateFin")
    private Date dateFin;

    public Evenement() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cooperative getCooperative() {
        return cooperative;
    }

    public void setCooperative(Cooperative cooperative) {
        this.cooperative = cooperative;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public String getSujetEvenement() {
        return sujetEvenement;
    }

    public void setSujetEvenement(String sujetEvenement) {
        this.sujetEvenement = sujetEvenement;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}
