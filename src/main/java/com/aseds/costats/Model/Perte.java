package com.aseds.costats.Model;

import javax.persistence.*;

@Entity
public class Perte {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idCooperative")
    private Cooperative cooperative;

    @Column(name="motifPerte")
    private String motifPerte;

    @Column(name="sommePerdue")
    private double sommePerdue;

    public Perte() {
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

    public String getMotifPerte() {
        return motifPerte;
    }

    public void setMotifPerte(String motifPerte) {
        this.motifPerte = motifPerte;
    }

    public double getSommePerdue() {
        return sommePerdue;
    }

    public void setSommePerdue(double sommePerdue) {
        this.sommePerdue = sommePerdue;
    }
}
