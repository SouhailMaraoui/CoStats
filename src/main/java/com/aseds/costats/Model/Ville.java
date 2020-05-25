package com.aseds.costats.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ville {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idRegion")
    private Region region;

    @Column(name="nomVille")
    private String nomVille;

    @OneToMany(mappedBy = "ville",cascade=CascadeType.ALL)
    private List<Formation> formations= new ArrayList<>();

    @OneToMany(mappedBy = "ville",cascade=CascadeType.ALL)
    private List<Evenement> evenements= new ArrayList<>();

    @OneToOne(mappedBy = "ville",cascade=CascadeType.ALL)
    private Adresse adresse;

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

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
