/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.douglas.moldejsfmaven;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author douglas
 */
@ManagedBean(name="mensagemBean")
@ApplicationScoped
public class MensagemBean implements Serializable{

    private String mensagem;
    /**
     * Creates a new instance of MensagemBean
     */
    public MensagemBean() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:S");
        mensagem = "Este bean com Sessão de Aplication foi criado no momento: "+sdf.format(Calendar.getInstance().getTime());
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
}
