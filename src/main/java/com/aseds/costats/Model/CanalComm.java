package com.aseds.costats.Model;

import javax.persistence.*;

@Entity
public class CanalComm {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="nomCanalComm")
    private String nomCanalComm;

    @OneToOne(mappedBy = "canalComm")
    private Communication communication;

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

    public Communication getCommunication() {
        return communication;
    }

    public void setCommunication(Communication communication) {
        this.communication = communication;
    }
}
