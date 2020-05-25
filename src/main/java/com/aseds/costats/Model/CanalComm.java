package com.aseds.costats.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class CanalComm {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="nomCanalComm")
    private String nomCanalComm;

    @JsonIgnore
    @OneToMany(mappedBy = "canalComm",cascade=CascadeType.ALL)
    private List<Communication> communications;

    public CanalComm() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomCanalComm() {
        return nomCanalComm;
    }

    public void setNomCanalComm(String nomCanalComm) {
        this.nomCanalComm = nomCanalComm;
    }

    public List<Communication> getCommunication() {
        return communications;
    }

    public void setCommunication(List<Communication> communication) {
        this.communications = communications;
    }
}
