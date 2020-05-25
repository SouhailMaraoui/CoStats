package com.aseds.costats.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="nomProfile")
    private String nomProfile;

    @JsonIgnore
    @OneToMany(mappedBy = "profile",cascade=CascadeType.ALL)
    private List<Membre> membres = new ArrayList<>();

    public Profile() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomProfile() {
        return nomProfile;
    }

    public void setNomProfile(String nomProfile) {
        this.nomProfile = nomProfile;
    }

    public List<Membre> getMembres() {
        return membres;
    }

    public void setMembres(List<Membre> membres) {
        this.membres = membres;
    }
}
