package com.aseds.costats.Model;

import javax.persistence.*;

@Entity
public class Adresse {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idVille", referencedColumnName = "id")
    private Ville ville;

    @Column(name="codePostal")
    private String codePostal;

    @Column(name="ligneAdresse")
    private String ligneAdresse;

    @OneToOne(mappedBy = "adresse",cascade=CascadeType.ALL)
    private Cooperative cooperative;

    public Adresse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getLigneAdresse() {
        return ligneAdresse;
    }

    public void setLigneAdresse(String ligneAdresse) {
        this.ligneAdresse = ligneAdresse;
    }

    public Cooperative getCooperative() {
        return cooperative;
    }

    public void setCooperative(Cooperative cooperative) {
        this.cooperative = cooperative;
    }
}
