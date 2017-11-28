package com.douglas.moldejsfmaven;

import com.douglas.moldejsfmaven.model.Pessoa;
import controle.Uteis;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "controleCRUDAjax")
@SessionScoped
public class ControleCRUDAjax implements Serializable {

    private List<Pessoa> lista = new ArrayList<Pessoa>();
    private Pessoa objeto;
    private Boolean editando;

    public ControleCRUDAjax() {
        editando = false;
    }

    public String listar() {
        return "crudAjax";
    }

    public void novo() {
        objeto = new Pessoa();
        editando = true;
    }

    public void salvar() {
        if (objeto.getId() == null) {
            objeto.setId(lista.size() + 1);
            lista.add(objeto);
        }
        FacesMessage msg = new FacesMessage(Uteis.getMsg("crud.sucesso.salvar"));
        FacesContext.getCurrentInstance().addMessage("", msg);
        editando = false;
    }

    public void cancelar() {
        editando = false;
    }

    public void alterar(Pessoa obj) {
        objeto = obj;
        editando = true;
        FacesMessage msg = new FacesMessage("Editando: " + "Nome:" + obj.getNome() + " E-mail: " + obj.getEmail());
        FacesContext.getCurrentInstance().addMessage("", msg);
    }

    public void excluir(Pessoa obj) {
        lista.remove(obj);
        FacesMessage msg = new FacesMessage(Uteis.getMsg("crud.sucesso.excluir"));
        FacesContext.getCurrentInstance().addMessage("", msg);
    }

    public List<Pessoa> getLista() {
        return lista;
    }

    public void setLista(List<Pessoa> lista) {
        this.lista = lista;
    }

    public Pessoa getObjeto() {
        return objeto;
    }

    public void setObjeto(Pessoa objeto) {
        this.objeto = objeto;
    }

    public boolean isEditando() {
        return editando;
    }

    public void setEditando(boolean editando) {
        this.editando = editando;
    }

}
