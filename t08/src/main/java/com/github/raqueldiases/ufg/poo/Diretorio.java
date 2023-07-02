package com.github.raqueldiases.ufg.poo;

import java.util.ArrayList;
import java.util.List;

public class Diretorio {
    private List<Usuario> usuariosAutorizados;

    public Diretorio() {
        usuariosAutorizados = new ArrayList<>();
    }

    public void adicionarUsuarioAutorizado(Usuario usuario) {
        usuariosAutorizados.add(usuario);
    }

    // Outros atributos, métodos e construtores da classe Diretorio
    // (adicionar conforme necessário)
}