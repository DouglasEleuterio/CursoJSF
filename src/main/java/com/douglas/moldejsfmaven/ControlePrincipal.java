/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.douglas.moldejsfmaven;

import com.sun.faces.el.FacesCompositeELResolver;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author douglas
 */
@ManagedBean (name="controlePrincipal")
@SessionScoped
public class ControlePrincipal implements Serializable {
    private String mensagem;

     public ControlePrincipal() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:S");
        mensagem = "Este bean com Sessão de Aplication foi criado no momento: "+sdf.format(Calendar.getInstance().getTime());
    }

     public String home(){
         return "/index";
     }
     
     public String sobre(){
         mensagem  = "Você navegou de Forma Dinamica";
         return "sobre";
     }
     
     public String sobreRedirecionado(){
         mensagem = "Voce Foi redirecionado para a página Sobre.xhtml através do \"sobre?faces-redirect=true\"; ";
        return "sobre?faces-redirect=true";
     }
     
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
}
