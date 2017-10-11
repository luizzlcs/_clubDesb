/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desb.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author laoslcs
 */
@Entity
@Table(name = "Logins")
public class Login implements Serializable {

    @Id
    private String login;
    @OneToOne
    private Desbravador idDesb;
    private Calendar dtAdicao;
    private boolean status;
    private Calendar dtBaixa;

    public Login() {
    }

    public Login(String login, Desbravador idDesb, Calendar dtAdicao, boolean status, Calendar dtBaixa) {
        this.login = login;
        this.idDesb = idDesb;
        this.dtAdicao = dtAdicao;
        this.status = status;
        this.dtBaixa = dtBaixa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.login);
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
        final Login other = (Login) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        return true;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Desbravador getIdDesb() {
        return idDesb;
    }

    public void setIdDesb(Desbravador idDesb) {
        this.idDesb = idDesb;
    }

    public Calendar getDtAdicao() {
        return dtAdicao;
    }

    public void setDtAdicao(Calendar dtAdicao) {
        this.dtAdicao = dtAdicao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Calendar getDtBaixa() {
        return dtBaixa;
    }

    public void setDtBaixa(Calendar dtBaixa) {
        this.dtBaixa = dtBaixa;
    }

    @Override
    public String toString() {
        return "Login{" + "login: " + login + ", idDesb: " + idDesb + ", dtAdicao: " + dtAdicao + ", status: " + status + ", dtBaixa: " + dtBaixa + '}';
    }

    
    
    
    
}
