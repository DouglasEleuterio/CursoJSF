package com.douglas.moldejsfmaven;

import com.douglas.moldejsfmaven.model.Pagamento;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author douglas
 */
@ManagedBean(name = "controlePagamento")
@SessionScoped
public class ControlePagamento implements Serializable {

    private Pagamento pagamento;
    private List<Pagamento> lista = new ArrayList<>();

    public ControlePagamento() {
        pagamento = new Pagamento();
    }

    public String adicionarPagamento() {
        lista.add(pagamento);
        pagamento = new Pagamento();
        return "formPagamento";
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public List<Pagamento> getLista() {
        return lista;
    }

    public void setLista(List<Pagamento> lista) {
        this.lista = lista;
    }

}
