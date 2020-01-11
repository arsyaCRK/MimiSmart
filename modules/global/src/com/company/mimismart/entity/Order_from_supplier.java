package com.company.mimismart.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@NamePattern("%s|name")
@Table(name = "MIMISMART_ORDER_FROM_SUPPLIER")
@Entity(name = "mimismart_Order_from_supplier")
public class Order_from_supplier extends StandardEntity {
    private static final long serialVersionUID = -7972784067534835077L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUPPLIER_ID")
    protected Supplier supplier;

    @NotNull
    @Column(name = "ORDER_NUM", nullable = false)
    protected BigDecimal order_num;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_", nullable = false)
    protected Date date;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STATUS_ID")
    protected OrderStatus status;

    @JoinTable(name = "MIMISMART_NOMENCLATURE_ORDER_FROM_SUPPLIER_LINK",
            joinColumns = @JoinColumn(name = "ORDER_FROM_SUPPLIER_ID"),
            inverseJoinColumns = @JoinColumn(name = "NOMENCLATURE_ID"))
    @ManyToMany
    protected Set<Nomenclature> nomenclatures;

    public void setNomenclatures(Set<Nomenclature> nomenclatures) {
        this.nomenclatures = nomenclatures;
    }

    public Set<Nomenclature> getNomenclatures() {
        return nomenclatures;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public @NotNull String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getOrder_num() {
        return order_num;
    }

    public void setOrder_num(BigDecimal order_num) {
        this.order_num = order_num;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}