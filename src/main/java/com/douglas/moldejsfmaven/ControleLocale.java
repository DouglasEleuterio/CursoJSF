/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.douglas.moldejsfmaven;

import java.io.Serializable;
import java.util.Locale;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

/**
 *
 * @author douglas
 */
@ManagedBean
@SessionScoped
public class ControleLocale implements Serializable{
    
    
    Locale currentLocale = new Locale("pt","BR");
 
    public ControleLocale(){
        
    }

    public void englishLocal(){
        UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
        currentLocale = Locale.US;
        viewRoot.setLocale(currentLocale);
    }
    
    public void portuguesLocal(){
        UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
        currentLocale = new Locale("pt","BR");
        viewRoot.setLocale(currentLocale);
    }
    
    public Locale getCurrentLocale() {
        return currentLocale;
    }

    public void setCurrentLocale(Locale currentLocale) {
        this.currentLocale = currentLocale;
    }
    
}
