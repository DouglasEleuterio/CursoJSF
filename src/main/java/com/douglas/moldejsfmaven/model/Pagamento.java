/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.douglas.moldejsfmaven.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author douglas
 */
public class Pagamento implements Serializable{
 
    private Double valor;
    private Date data;

    public Pagamento() {
        //Receberá a hora corrente do sistema Operacional.
        data = new Date();
    }
    
    public Pagamento(Double valor, Date data){
        this.valor = valor;
        this.data = data;
    }
    
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
}
