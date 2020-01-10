package com.company.mimismart.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "MIMISMART_ORDER_STATUS")
@Entity(name = "mimismart_OrderStatus")
public class OrderStatus extends StandardEntity {
    private static final long serialVersionUID = 6137989135735345122L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 50)
    protected String name;

    @NotNull
    @Column(name = "DESCRIPTION", nullable = false)
    protected String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}