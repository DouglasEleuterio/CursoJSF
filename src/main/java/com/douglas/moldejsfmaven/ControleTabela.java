/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.douglas.moldejsfmaven;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author douglas
 */
@ManagedBean(name="controleTabela")
@SessionScoped
public class ControleTabela implements Serializable{
    
    private List<Pessoa> lista;

     public ControleTabela(){
        lista = new ArrayList<Pessoa>();
        lista.add((new Pessoa(1,"Douglas", "(62) 98462-8510")));
        lista.add((new Pessoa(2,"Pedro", "(62) 98462-8510")));
        lista.add((new Pessoa(3,"Lucas", "(62) 98462-8510")));
        lista.add((new Pessoa(4,"Eduardo", "(62) 98462-8510")));
        lista.add((new Pessoa(lista.size()+1,"Pedro Paulo", "(62) 98462-8510")));
        lista.add((new Pessoa(lista.size()+1,"Samuel", "(62) 98462-8510")));
        lista.add((new Pessoa(lista.size()+1,"Meire", "(62) 98462-8510")));
        lista.add((new Pessoa(lista.size()+1,"Evelyn", "(62) 98462-8510")));
        lista.add((new Pessoa(lista.size()+1,"Cida", "(62) 98462-8510")));
        lista.add((new Pessoa(lista.size()+1,"Ana Paula", "(62) 0000-8510")));
        lista.add((new Pessoa(lista.size()+1,"Ana Paula", "(62) 0000-8510")));
        lista.add((new Pessoa(lista.size()+1,"Ana Paula", "(62) 0000-8510")));
    }
     
    public String salvar(){
        for (Pessoa obj : lista) obj.setEditando(false);
        return null;
    } 
    
    public String remover(Pessoa obj){
        lista.remove(obj);
        return null;
    }
        
    public List<Pessoa> getLista() {
        return lista;
    }

    public void setLista(List<Pessoa> lista) {
        this.lista = lista;
    }
    
   
}
