package com.aseds.costats.Model;

import javax.persistence.*;

@Entity
public class Rapport {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="annee")
    private String annee;

    @Column(name="idCooperative")
    private Long idCooperative;

    @Column(name="activite")
    private String activite;
    @Column(name="finanacier")
    private String finanacier;

    public Rapport() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public Long getIdCooperative() {
        return idCooperative;
    }

    public void setIdCooperative(Long idCooperative) {
        this.idCooperative = idCooperative;
    }

    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    public String getFinanacier() {
        return finanacier;
    }

    public void setFinanacier(String finanacier) {
        this.finanacier = finanacier;
    }
}
