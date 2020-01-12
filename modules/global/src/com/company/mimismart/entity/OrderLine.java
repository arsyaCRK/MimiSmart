package com.company.mimismart.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "MIMISMART_ORDER_LINE")
@Entity(name = "mimismart_OrderLine")
public class OrderLine extends StandardEntity {
    private static final long serialVersionUID = 428098020199203938L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    protected Order_from_supplier order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NOMENKLATURA_ID")
    protected Nomenclature nomenklatura;

    @Column(name = "QUANTITY")
    protected BigDecimal quantity;

    @Column(name = "QTYFACT")
    protected BigDecimal qtyfact;

    public BigDecimal getQtyfact() {
        return qtyfact;
    }

    public void setQtyfact(BigDecimal qtyfact) {
        this.qtyfact = qtyfact;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Nomenclature getNomenklatura() {
        return nomenklatura;
    }

    public void setNomenklatura(Nomenclature nomenklatura) {
        this.nomenklatura = nomenklatura;
    }

    public Order_from_supplier getOrder() {
        return order;
    }

    public void setOrder(Order_from_supplier order) {
        this.order = order;
    }
}