package com.studyabroad.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * 机构
 * Created by frank on 2017/1/2.
 */
@Entity
public class Organization implements Serializable {

    @Id
    @GeneratedValue
    private Long Id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column
    private String contact;

    @Column
    private String mobileNo;

    @Column
    private String bankName;

    @Column
    private String bankAccount;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "organization_university",joinColumns = @JoinColumn(name = "organization_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "university_id",referencedColumnName = "id"))
    private Set<University> universities;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Set<University> getUniversities() {
        return universities;
    }

    public void setUniversities(Set<University> universities) {
        this.universities = universities;
    }
}
