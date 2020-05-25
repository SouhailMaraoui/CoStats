package com.aseds.costats.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Membre {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @JsonIgnore
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idCooperative")
    private Cooperative cooperative;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idProfile")
    private Profile profile;

    @Column(name="Sexe")
    private String sexe;

    @Column(name="nomComplet")
    private String nomComplet;

    @Column(name="CIN")
    private String CIN;

    @Column(name="email")
    private String email;

    @Column(name="telephone")
    private String telephone;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "membreAssemblee",
            joinColumns = @JoinColumn(name = "idMembre"),
            inverseJoinColumns = @JoinColumn(name = "idAssemblee"))
    List<Assemblee> assemblees;

    public Membre() {
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

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Assemblee> getAssemblees() {
        return assemblees;
    }

    public void setAssemblees(List<Assemblee> assemblees) {
        this.assemblees = assemblees;
    }
}
