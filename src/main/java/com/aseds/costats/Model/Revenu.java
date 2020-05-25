package com.aseds.costats.Model;

import javax.persistence.*;

@Entity
public class Revenu {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idCooperative")
    private Cooperative cooperative;

    @Column(name="sourceRevenue")
    private String sourceRevenue;

    @Column(name="sommeGagnee")
    private double sommeGagnee;

    public Revenu() {
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

    public String getSourceRevenue() {
        return sourceRevenue;
    }

    public void setSourceRevenue(String sourceRevenue) {
        this.sourceRevenue = sourceRevenue;
    }

    public double getSommeGagnee() {
        return sommeGagnee;
    }

    public void setSommeGagnee(double sommeGagnee) {
        this.sommeGagnee = sommeGagnee;
    }
}
