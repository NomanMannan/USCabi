/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uscabi.commons;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
/**
 *
 * @author noman-pc
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Operator extends Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    private String companyName;
    @Enumerated(EnumType.STRING)
    private OperatorType operatorType;
    
    @OneToMany(mappedBy = "operator")
    private List<Driver> drivers;

    public Operator() {
    }

    public Operator(String companyName, String firstName, String lastName, String contactNumber, Date registrationNumber, String email, byte[] image, Date dob, Address address, UserCredential user) {
        super(firstName, lastName, contactNumber, registrationNumber, email, image, dob, address, user);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public OperatorType getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(OperatorType operatorType) {
        this.operatorType = operatorType;
    }
    
}
