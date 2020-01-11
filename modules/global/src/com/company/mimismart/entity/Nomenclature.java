package com.company.mimismart.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "MIMISMART_NOMENCLATURE")
@Entity(name = "mimismart_Nomenclature")
public class Nomenclature extends StandardEntity {
    private static final long serialVersionUID = -541318328589440623L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 100)
    protected String name;

    @OnDeleteInverse(DeletePolicy.DENY)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UNIT_ID")
    protected Units unit;

    @Column(name = "DESCRIPTION")
    protected String description;

    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_FROM_SUPPLIER_ID")
    protected Order_from_supplier order_from_supplier;

    public Order_from_supplier getOrder_from_supplier() {
        return order_from_supplier;
    }

    public void setOrder_from_supplier(Order_from_supplier order_from_supplier) {
        this.order_from_supplier = order_from_supplier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Units getUnit() {
        return unit;
    }

    public void setUnit(Units unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}