/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.douglas.moldejsfmaven;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

/**
 *
 * @author douglas
 */

@ManagedBean(name = "controleComponentes")
@SessionScoped
public class ControleComponentes implements Serializable{
    private String texto; 
    private String idComponente;

    public String getIdComponente() {
        return idComponente;
    }

    public void listener(ActionEvent event){
        UIComponent source = event.getComponent();
        idComponente = source.getId();
    }
    
    
    public String geraTexto(){
        texto = "Texto Gerado:  < >  & <b> Texto em Negrito</b>";
        return "compentesParte2";
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void setIdComponente(String idComponente) {
        this.idComponente = idComponente;
    }
    
    public ControleComponentes() {
        texto = "";
    }
    
}
