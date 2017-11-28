/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.douglas.moldejsfmaven;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author douglas
 */
@ManagedBean(name = "controlePessoa")
@SessionScoped
public class ControlePessoa implements Serializable{

    private Boolean opcaoSelecionada;
    private Boolean pessoaFisica;
    private Integer id;
    private String nome;
    private String cpf;
    private String cnpj;
    private String saida;

    /**
     * No primeiro acesso a opçãoSelecionada será false.
     */
    public ControlePessoa() {
        opcaoSelecionada = false;
        pessoaFisica = null;
    }

    /**
     * para não precisar que o usuario submeta o formulário com a seleção escolhida, vamos escutar a mudança no evento.
     * Ao escutar o evento, e receber o valor, ele aciona o metodo selecionar.
     * @param e 
     */
    public void tipoChange(ValueChangeEvent e){
        pessoaFisica = (Boolean) e.getNewValue();
        selecionar();
    }
    
    /**
     * Metodo que seleciona o que metodo fez.
     * @return formPessoa.
     * Caso a pessoa selecionada seja pessoa fisica retornará Pessoa Fisica.
     */
    public String selecionar() {
        opcaoSelecionada = true;
        String selecao = pessoaFisica == true ? "Pessoa Fisica" : "Pessoa Juridica";
        //Bean interagindo com o Faces.
        FacesMessage msg = new FacesMessage("Tipo Selecionado: " + selecao);
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
        return "formPessoa";

    }

    /**
     * Exibir os dados após o usuario submeter os dados.
     * @return dadosPessoa;
     */
    public String exibirDados(){
        saida = "";
        saida += "Valores Recebidos";
        saida += "<br/>"+(pessoaFisica ? "Nome:" + nome : "Razão Social"+nome) ;
        saida += "<br/>"+(pessoaFisica ? "CPF:" + cpf : "CNPJ"+cnpj) ;
        FacesMessage msg = new FacesMessage("Dados Recebidos com Sucesso!");
        FacesContext.getCurrentInstance().addMessage(cnpj, msg);
        
        return "dadosPessoa";
    }
    
    /**
     * Voltar para a tela com os dados, e redefinir os valores.
     * @return 
     */
    public String voltar(){
        opcaoSelecionada = false;
        id = null;
        nome = "";
        cpf = "";
        cnpj = "";
        pessoaFisica = null;
        return "formPessoa";
    }

    public Boolean getOpcaoSelecionada() {
        return opcaoSelecionada;
    }

    public void setOpcaoSelecionada(Boolean opcaoSelecionada) {
        this.opcaoSelecionada = opcaoSelecionada;
    }

    public Boolean getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(Boolean pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }
    
    
    
}
