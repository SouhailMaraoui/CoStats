package com.aseds.costats.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cooperative {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idSecteur", referencedColumnName = "id")
    private Secteur secteur;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idAdresse", referencedColumnName = "id")
    private Adresse adresse;

    @Column(name="nomCooperative")
    private String nomCooperative;

    @Column(name="motDePasse")
    private String motDePasse;

    @JsonIgnore
    @OneToMany(mappedBy = "cooperative")
    private List<Membre> membres = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "cooperative",cascade=CascadeType.ALL)
    private List<Formation> formations= new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "cooperative",cascade=CascadeType.ALL)
    private List<Produit> produits= new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "cooperative",cascade=CascadeType.ALL)
    private List<Evenement> evenements= new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "cooperative",cascade=CascadeType.ALL)
    private List<Communication> communications= new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "cooperative",cascade=CascadeType.ALL)
    private List<Assemblee> assemblees= new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "cooperative",cascade=CascadeType.ALL)
    private List<Revenu> revenus= new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "cooperative",cascade=CascadeType.ALL)
    private List<Perte> pertes= new ArrayList<>();

    public Cooperative() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getNomCooperative() {
        return nomCooperative;
    }

    public void setNomCooperative(String nomCooperative) {
        this.nomCooperative = nomCooperative;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public List<Membre> getMembres() {
        return membres;
    }

    public void setMembres(List<Membre> membres) {
        this.membres = membres;
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public List<Evenement> getEvenements() {
        return evenements;
    }

    public void setEvenements(List<Evenement> evenements) {
        this.evenements = evenements;
    }

    public List<Communication> getCommunications() {
        return communications;
    }

    public void setCommunications(List<Communication> communications) {
        this.communications = communications;
    }

    public List<Assemblee> getAssemblees() {
        return assemblees;
    }

    public void setAssemblees(List<Assemblee> assemblees) {
        this.assemblees = assemblees;
    }

    public List<Revenu> getRevenus() {
        return revenus;
    }

    public void setRevenus(List<Revenu> revenus) {
        this.revenus = revenus;
    }

    public List<Perte> getPertes() {
        return pertes;
    }

    public void setPertes(List<Perte> pertes) {
        this.pertes = pertes;
    }
}
