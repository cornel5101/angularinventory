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
@Table(name = "usertype", catalog = "anginventmanager", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usertype.findAll", query = "SELECT u FROM Usertype u")
    , @NamedQuery(name = "Usertype.findByTypeid", query = "SELECT u FROM Usertype u WHERE u.typeid = :typeid")
    , @NamedQuery(name = "Usertype.findByRole", query = "SELECT u FROM Usertype u WHERE u.role = :role")})
public class Usertype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "typeid")
    private Integer typeid;
    @Column(name = "role")
    private String role;
    @OneToMany(mappedBy = "usertypeid")
    private List<Users> usersList;

    public Usertype() {
    }

    public Usertype(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (typeid != null ? typeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usertype)) {
            return false;
        }
        Usertype other = (Usertype) object;
        if ((this.typeid == null && other.typeid != null) || (this.typeid != null && !this.typeid.equals(other.typeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "angularinventory.Usertype[ typeid=" + typeid + " ]";
    }
    
}
