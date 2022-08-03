package com.codegym.ss7_c0222g1.model.login;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer id;

    private String name;

    @ManyToMany(mappedBy = "role")
    @JsonIgnore
    private Set<AppUser> appUser;

    public Role() {
    }

    public Role(Integer id, String name, Set<AppUser> appUser) {
        this.id = id;
        this.name = name;
        this.appUser = appUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<AppUser> getAppUser() {
        return appUser;
    }

    public void setAppUser(Set<AppUser> appUser) {
        this.appUser = appUser;
    }
}

