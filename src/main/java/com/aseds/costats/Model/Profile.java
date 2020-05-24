package com.aseds.costats.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Profile {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="nomProfile")
    private String nomProfile;

    @OneToMany(mappedBy = "profile")
    private List<Member> members= new ArrayList<>();

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

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
