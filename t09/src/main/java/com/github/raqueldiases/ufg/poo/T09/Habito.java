package com.github.raqueldiases.ufg.poo.T09

public class Habito {
    private Pessoa pessoa;
    private String descricao;

    public Habito(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public Habito(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}