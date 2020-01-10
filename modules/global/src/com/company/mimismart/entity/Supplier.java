package com.company.mimismart.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|company_name")
@Table(name = "MIMISMART_SUPPLIER")
@Entity(name = "mimismart_Supplier")
public class Supplier extends StandardEntity {
    private static final long serialVersionUID = 1862726365228298451L;

    @NotNull
    @Column(name = "COMPANY_NAME", nullable = false, length = 100)
    protected String company_name;

    @NotNull
    @Column(name = "COMPANY_ADDRESS", nullable = false)
    protected String company_address;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, length = 12)
    protected String phone_number;

    @NotNull
    @Column(name = "EMAIL", nullable = false, length = 50)
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
}