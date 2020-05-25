package com.aseds.costats.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Secteur {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="nomSecteur")
    private String nomSecteur;

    @JsonIgnore
    @OneToOne(mappedBy = "secteur",cascade=CascadeType.ALL)
    private Cooperative cooperative;

    public Secteur() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomSecteur() {
        return nomSecteur;
    }

    public void setNomSecteur(String nomSecteur) {
        this.nomSecteur = nomSecteur;
    }

    public Cooperative getCooperative() {
        return cooperative;
    }

    public void setCooperative(Cooperative cooperative) {
        this.cooperative = cooperative;
    }
}
