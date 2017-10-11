/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desb.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author laoslcs
 */

@Entity
@Table(name ="MeusDistintivos")
public class MeusDistintivos implements Serializable {

    private static final int serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToMany
    private List<Desbravador> idDesb;
    @ManyToMany
    private List<Distintivo> idDistintivo;
    private Calendar dtInvestidura;
    private String observacao;

    public MeusDistintivos() {
    }

    public MeusDistintivos(int id, List<Desbravador> idDesb, List<Distintivo> idDistintivo, Calendar dtInvestidura, String observacao) {
        this.id = id;
        this.idDesb = idDesb;
        this.idDistintivo = idDistintivo;
        this.dtInvestidura = dtInvestidura;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Desbravador> getIdDesb() {
        return idDesb;
    }

    public void setIdDesb(List<Desbravador> idDesb) {
        this.idDesb = idDesb;
    }

    public List<Distintivo> getIdDistintivo() {
        return idDistintivo;
    }

    public void setIdDistintivo(List<Distintivo> idDistintivo) {
        this.idDistintivo = idDistintivo;
    }

    public Calendar getDtInvestidura() {
        return dtInvestidura;
    }

    public void setDtInvestidura(Calendar dtInvestidura) {
        this.dtInvestidura = dtInvestidura;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MeusDistintivos other = (MeusDistintivos) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MeusDistintivos{" + "id=" + id + ", idDesb=" + idDesb + ", idDistintivo=" + idDistintivo + ", dtInvestidura=" + dtInvestidura + ", observacao=" + observacao + '}';
    }
    

    
}
