package com.github.raqueldiases.ufg.poo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Diretorio> diretoriosProprios;

    public Usuario() {
        diretoriosProprios = new ArrayList<>();
    }

    public void adicionarDiretorioProprio(Diretorio diretorio) {
        diretoriosProprios.add(diretorio);
    }

}