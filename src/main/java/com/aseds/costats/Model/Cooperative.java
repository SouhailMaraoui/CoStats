package com.aseds.costats.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cooperative {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @OneToOne
    @JoinColumn(name="idSecteur", referencedColumnName = "id")
    private Secteur secteur;

    @OneToOne
    @JoinColumn(name="idAdresse", referencedColumnName = "id")
    private Adresse adresse;

    @Column(name="nomCooperative")
    private String nomCooperative;

    @Column(name="motDePasse")
    private String motDePasse;

    @OneToMany(mappedBy = "cooperative")
    private List<Member> members= new ArrayList<>();

    @OneToMany(mappedBy = "cooperative")
    private List<Formation> formations= new ArrayList<>();

    @OneToMany(mappedBy = "cooperative")
    private List<Produit> produits= new ArrayList<>();

    @OneToMany(mappedBy = "cooperative")
    private List<Evenement> evenements= new ArrayList<>();

    @OneToMany(mappedBy = "cooperative")
    private List<Communication> communications= new ArrayList<>();

    @OneToMany(mappedBy = "cooperative")
    private List<Assemblee> assemblees= new ArrayList<>();

    @OneToMany(mappedBy = "cooperative")
    private List<Revenu> revenus= new ArrayList<>();

    @OneToMany(mappedBy = "cooperative")
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

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
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
