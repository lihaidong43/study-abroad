package com.studyabroad.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;
import java.util.Set;

/**
 * 院校
 * Created by frank on 2017/1/2.
 */
@Entity
public class University implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private String major;

    @Column(nullable = false)
    private String degree;

    @Column
    private Float gpa;

    @Column
    private Float toefl;

    @Column
    private Float ielts;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String website;

    @Column
    private Blob description;


    @ManyToMany(mappedBy = "universities")
    private Set<Organization> organizations;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    public Float getToefl() {
        return toefl;
    }

    public void setToefl(Float toefl) {
        this.toefl = toefl;
    }

    public Float getIelts() {
        return ielts;
    }

    public void setIelts(Float ielts) {
        this.ielts = ielts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Blob getDescription() {
        return description;
    }

    public void setDescription(Blob description) {
        this.description = description;
    }

    public Set<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(Set<Organization> organizations) {
        this.organizations = organizations;
    }
}
