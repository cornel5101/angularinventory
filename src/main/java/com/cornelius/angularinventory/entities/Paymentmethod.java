/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cornelius.angularinventory.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author cornelius
 */
@Entity
@Table(name = "paymentmethod", catalog = "anginventmanager", schema = "")
@NamedQueries({
    @NamedQuery(name = "Paymentmethod.findAll", query = "SELECT p FROM Paymentmethod p")
    , @NamedQuery(name = "Paymentmethod.findByPaymentMethodId", query = "SELECT p FROM Paymentmethod p WHERE p.paymentMethodId = :paymentMethodId")
    , @NamedQuery(name = "Paymentmethod.findByTypes", query = "SELECT p FROM Paymentmethod p WHERE p.types = :types")})
public class Paymentmethod implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "payment_method_id")
    private Integer paymentMethodId;
    @Column(name = "types")
    private String types;
    @OneToMany(mappedBy = "paymentMethodId")
    private List<Transaction> transactionList;

    public Paymentmethod() {
    }

    public Paymentmethod(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public Integer getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentMethodId != null ? paymentMethodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paymentmethod)) {
            return false;
        }
        Paymentmethod other = (Paymentmethod) object;
        if ((this.paymentMethodId == null && other.paymentMethodId != null) || (this.paymentMethodId != null && !this.paymentMethodId.equals(other.paymentMethodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "angularinventory.Paymentmethod[ paymentMethodId=" + paymentMethodId + " ]";
    }
    
}
