package com.github.raqueldiases.ufg.poo;

public class Arquivo {
    private List<Permissao> permissoes;

    public Arquivo() {
        permissoes = new ArrayList<>();
    }

    public void adicionarPermissao(Permissao permissao) {
        permissoes.add(permissao);
    }

}