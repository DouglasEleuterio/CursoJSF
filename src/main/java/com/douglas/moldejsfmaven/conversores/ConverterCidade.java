/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.douglas.moldejsfmaven.conversores;

import com.douglas.moldejsfmaven.Cidade;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author douglas
 */
@ManagedBean(name = "converterCidade")
@SessionScoped
public class ConverterCidade implements Converter {

    List<Cidade> cidades;

    public ConverterCidade(List<Cidade> lista) {
        this.cidades = lista;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String string) {
        Cidade retorno = null;
        for (Cidade c : cidades) {
            if (c.getCodigo().equals(Integer.parseInt(string))) {
                retorno = c;
            }
        }
        return retorno;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object obj) {
        if (obj == null) {
            return null;
        }
        Cidade retorno = (Cidade) obj;
        return retorno.getCodigo().toString();
    }

}
