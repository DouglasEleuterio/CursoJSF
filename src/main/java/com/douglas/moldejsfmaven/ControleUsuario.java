/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.douglas.moldejsfmaven;

import com.douglas.moldejsfmaven.model.Usuario;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author douglas
 */
@ManagedBean(name = "controleUsuario")
@RequestScoped
public class ControleUsuario implements Serializable{
    
    private Usuario usuario ; 

    public ControleUsuario (){
        usuario = new Usuario();
    }
    
    public String recebeDados(){
        FacesMessage msg = new FacesMessage("Dados recebido com sucesso");
        FacesContext.getCurrentInstance().addMessage("", msg);
        return "formUsuario";
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
