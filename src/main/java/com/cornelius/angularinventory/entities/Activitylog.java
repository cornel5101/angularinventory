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
@Table(name = "activitylog", catalog = "anginventmanager", schema = "")
@NamedQueries({
    @NamedQuery(name = "Activitylog.findAll", query = "SELECT a FROM Activitylog a")
    , @NamedQuery(name = "Activitylog.findByLogid", query = "SELECT a FROM Activitylog a WHERE a.logid = :logid")
    , @NamedQuery(name = "Activitylog.findByDescription", query = "SELECT a FROM Activitylog a WHERE a.description = :description")
    , @NamedQuery(name = "Activitylog.findByDate", query = "SELECT a FROM Activitylog a WHERE a.date = :date")})
public class Activitylog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "logid")
    private Integer logid;
    @Column(name = "description")
    private String description;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Activitylog() {
    }

    public Activitylog(Integer logid) {
        this.logid = logid;
    }

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logid != null ? logid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Activitylog)) {
            return false;
        }
        Activitylog other = (Activitylog) object;
        if ((this.logid == null && other.logid != null) || (this.logid != null && !this.logid.equals(other.logid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "angularinventory.Activitylog[ logid=" + logid + " ]";
    }
    
}
