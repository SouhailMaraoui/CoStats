package com.aseds.costats.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Communication {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @JsonIgnore
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idCooperative")
    private Cooperative cooperative;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idCanalComm")
    private CanalComm canalComm;

    @Column(name="nombreUtilisationAnnuel")
    private int nombreUtilisationAnnuel;

    public Communication() {
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

    public CanalComm getCanalComm() {
        return canalComm;
    }

    public void setCanalComm(CanalComm canalComm) {
        this.canalComm = canalComm;
    }

    public int getNombreUtilisationAnnuel() {
        return nombreUtilisationAnnuel;
    }

    public void setNombreUtilisationAnnuel(int nombreUtilisationAnnuel) {
        this.nombreUtilisationAnnuel = nombreUtilisationAnnuel;
    }
}
