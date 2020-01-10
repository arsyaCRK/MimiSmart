package com.company.mimismart.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "MIMISMART_UNITS")
@Entity(name = "mimismart_Units")
public class Units extends StandardEntity {
    private static final long serialVersionUID = -5324697537039841537L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 5)
    protected String name;

    @NotNull
    @Column(name = "DESCRIPTION", nullable = false, length = 25)
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