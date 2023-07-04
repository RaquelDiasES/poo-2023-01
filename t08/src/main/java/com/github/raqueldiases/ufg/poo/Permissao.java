package com.github.raqueldiases.ufg.poo;

public class Permissao {
    private Grupo grupos;
    private Arquivo arquivo;

    public Permissao(Grupo grupo, Arquivo arquivo) {
        this.grupo = grupo;
        this.arquivo = arquivo;
    }
}