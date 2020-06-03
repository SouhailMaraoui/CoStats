package com.aseds.costats.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Communication {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="idCanalComm")
    private Long idCanalComm;

    @Column(name="nombreUtilisationAnnuel")
    private Long nombreUtilisationAnnuel;

    @Column(name="annee")
    private String annnee;

    public Communication() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCanalComm() {
        return idCanalComm;
    }

    public void setIdCanalComm(Long idCanalComm) {
        this.idCanalComm = idCanalComm;
    }

    public Long getNombreUtilisationAnnuel() {
        return nombreUtilisationAnnuel;
    }

    public void setNombreUtilisationAnnuel(Long nombreUtilisationAnnuel) {
        this.nombreUtilisationAnnuel = nombreUtilisationAnnuel;
    }

    public String getAnnnee() {
        return annnee;
    }

    public void setAnnnee(String annnee) {
        this.annnee = annnee;
    }
}
