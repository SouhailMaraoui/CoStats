package com.aseds.costats.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ville {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @JsonIgnore
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idRegion")
    private Region region;

    @Column(name="nomVille")
    private String nomVille;

    @JsonIgnore
    @OneToMany(mappedBy = "ville",cascade=CascadeType.ALL)
    private List<Formation> formations= new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "ville",cascade=CascadeType.ALL)
    private List<Evenement> evenements= new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "ville",cascade=CascadeType.ALL)
    private List<Adresse> adresses;

    public Ville() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }

    public List<Evenement> getEvenements() {
        return evenements;
    }

    public void setEvenements(List<Evenement> evenements) {
        this.evenements = evenements;
    }

    public List<Adresse>  getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adresse>  adresse) {
        this.adresses = adresse;
    }
}
