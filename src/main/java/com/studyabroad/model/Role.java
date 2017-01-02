package com.studyabroad.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by frank on 2017/1/2.
 */
@Entity
public class Role implements Serializable {


    @Id
    @GeneratedValue
    private Long Id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Organization organization;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
