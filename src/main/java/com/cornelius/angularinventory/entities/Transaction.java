/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cornelius.angularinventory.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author cornelius
 */
@Entity
@Table(name = "transaction", catalog = "anginventmanager", schema = "")
@NamedQueries({
    @NamedQuery(name = "Transaction.findAll", query = "SELECT t FROM Transaction t")
    , @NamedQuery(name = "Transaction.findByTransactionid", query = "SELECT t FROM Transaction t WHERE t.transactionid = :transactionid")
    , @NamedQuery(name = "Transaction.findByCustomername", query = "SELECT t FROM Transaction t WHERE t.customername = :customername")
    , @NamedQuery(name = "Transaction.findByQuantityOrdered", query = "SELECT t FROM Transaction t WHERE t.quantityOrdered = :quantityOrdered")
    , @NamedQuery(name = "Transaction.findByOrderDate", query = "SELECT t FROM Transaction t WHERE t.orderDate = :orderDate")
    , @NamedQuery(name = "Transaction.findBySubTotal", query = "SELECT t FROM Transaction t WHERE t.subTotal = :subTotal")
    , @NamedQuery(name = "Transaction.findByTax", query = "SELECT t FROM Transaction t WHERE t.tax = :tax")
    , @NamedQuery(name = "Transaction.findByDiscount", query = "SELECT t FROM Transaction t WHERE t.discount = :discount")
    , @NamedQuery(name = "Transaction.findByNetTotal", query = "SELECT t FROM Transaction t WHERE t.netTotal = :netTotal")
    , @NamedQuery(name = "Transaction.findByAmountPaid", query = "SELECT t FROM Transaction t WHERE t.amountPaid = :amountPaid")})
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "transactionid")
    private Integer transactionid;
    @Column(name = "customername")
    private String customername;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantity_ordered")
    private Double quantityOrdered;
    @Column(name = "order_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @Column(name = "sub_total")
    private Double subTotal;
    @Column(name = "tax")
    private Double tax;
    @Column(name = "discount")
    private Integer discount;
    @Column(name = "net_total")
    private Double netTotal;
    @Column(name = "amount_paid")
    private Double amountPaid;
    @JoinColumn(name = "payment_method_id", referencedColumnName = "payment_method_id")
    @ManyToOne
    private Paymentmethod paymentMethodId;
    @JoinColumn(name = "productid", referencedColumnName = "productid")
    @ManyToOne
    private Product productid;

    public Transaction() {
    }

    public Transaction(Integer transactionid) {
        this.transactionid = transactionid;
    }

    public Integer getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(Integer transactionid) {
        this.transactionid = transactionid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public Double getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(Double quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Double getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(Double netTotal) {
        this.netTotal = netTotal;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Paymentmethod getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Paymentmethod paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public Product getProductid() {
        return productid;
    }

    public void setProductid(Product productid) {
        this.productid = productid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionid != null ? transactionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaction)) {
            return false;
        }
        Transaction other = (Transaction) object;
        if ((this.transactionid == null && other.transactionid != null) || (this.transactionid != null && !this.transactionid.equals(other.transactionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "angularinventory.Transaction[ transactionid=" + transactionid + " ]";
    }
    
}
