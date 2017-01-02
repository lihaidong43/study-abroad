package com.studyabroad.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * Created by frank on 2017/1/2.
 */
@Entity
@Table(name = "organization_university")
public class OrganizationUniversity implements Serializable{

    @Id
    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @Id
    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    @Column
    private String commissionType;

    @Column
    private String commission;


    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(String commissionType) {
        this.commissionType = commissionType;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }
}
