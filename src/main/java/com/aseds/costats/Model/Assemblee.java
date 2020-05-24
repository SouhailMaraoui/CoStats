package com.aseds.costats.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Assemblee {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="idCooperative")
    private Cooperative cooperative;

    @Column(name="motifAssemblee")
    private String motifAssemblee;

    @Column(name="dateDebut")
    private Date dateDebut;

    @Column(name="dateFin")
    private Date dateFin;

    @ManyToMany(mappedBy = "assemblees")
    List<Member> members;

    public Assemblee() {
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

    public String getMotifAssemblee() {
        return motifAssemblee;
    }

    public void setMotifAssemblee(String motifAssemblee) {
        this.motifAssemblee = motifAssemblee;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
