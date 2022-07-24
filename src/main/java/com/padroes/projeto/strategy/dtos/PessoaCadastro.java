package com.padroes.projeto.strategy.dtos;

import com.padroes.projeto.strategy.enums.TipoConta;

public class PessoaCadastro {

    private String nome;
    private String numeroFiscal;
    private TipoConta tipoConta;

    public PessoaCadastro(String nome) {
        super();
    }

    public PessoaCadastro(String nome, String numeroFiscal, TipoConta tipoConta) {
        this.nome = nome;
        this.numeroFiscal = numeroFiscal;
        this.tipoConta = tipoConta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public void setNumeroFiscal(String numeroFiscal) {
        this.numeroFiscal = numeroFiscal;
    }
}
