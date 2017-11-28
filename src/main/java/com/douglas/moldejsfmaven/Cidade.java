/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.douglas.moldejsfmaven;

import java.io.Serializable;

/**
 *
 * @author douglas
 */

public class Cidade implements Serializable{
    
    private Integer codigo;
    private String nome;
    private String uf;

    public Cidade() {
    
    }

    public Cidade(Integer codigo, String nome, String uf) {
        this.codigo = codigo;
        this.nome = nome;
        this.uf = uf;
    }

    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
