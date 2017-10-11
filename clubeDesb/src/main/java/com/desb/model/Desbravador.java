/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desb.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Calendar;

/**
 *
 * @author laoslcs
 */
@Entity
@Table(name = "Desbravadores")
public class Desbravador implements Serializable {

    private static final int serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private Sexo idSexo;
    private String nome;
    private Calendar dtNascimento;
    private String cpf;
    private String rg;
    private String foto;

    public Desbravador() {
    }

    public Desbravador(int id, Sexo idSexo, String nome, Calendar dtNascimento, String cpf, String rg, String foto) {
        this.id = id;
        this.idSexo = idSexo;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sexo getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Sexo idSexo) {
        this.idSexo = idSexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Calendar dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Desbravador)) {
            return false;
        }
        Desbravador other = (Desbravador) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Desbravador{" + "id: " + id + ", idSexo: " + idSexo + ", nome: " + nome + ", dtNascimento: " + dtNascimento + ", cpf: " + cpf + ", rg: " + rg + ", foto: " + foto + '}';
    }

    
    
}
