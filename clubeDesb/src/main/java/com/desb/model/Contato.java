/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desb.model;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author laoslcs
 */
@Entity
@Table(name = "Contatos")
public class Contato implements Serializable {

    private static final int serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToMany
    private List<Estado> idEstado;
    @ManyToMany
    private List<Desbravador> idDesbravador;
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String telefone;
    private String celular;
    private String whastsapp;
    
    
    

    public Contato() {
        
    }

    public Contato(int id, List<Estado> idEstado, List<Desbravador> idDesbravador, String cep, String logradouro, String numero, String complemento, String telefone, String celular, String whastsapp) {
        this.id = id;
        this.idEstado = idEstado;
        this.idDesbravador = idDesbravador;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.telefone = telefone;
        this.celular = celular;
        this.whastsapp = whastsapp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Estado> getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(List<Estado> idEstado) {
        this.idEstado = idEstado;
    }

    public List<Desbravador> getIdDesbravador() {
        return idDesbravador;
    }

    public void setIdDesbravador(List<Desbravador> idDesbravador) {
        this.idDesbravador = idDesbravador;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getWhastsapp() {
        return whastsapp;
    }

    public void setWhastsapp(String whastsapp) {
        this.whastsapp = whastsapp;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
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
        final Contato other = (Contato) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contato{" + "id=" + id + ", idEstado=" + idEstado + ", idDesbravador=" + idDesbravador + ", cep=" + cep + ", logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento + ", telefone=" + telefone + ", celular=" + celular + ", whastsapp=" + whastsapp + '}';
    }

      

   

    
    
}
