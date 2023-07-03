package com.github.raqueldiases.ufg.poo;

public class Grupo {
    private List<Usuario> usuarios;
    private List<Permissao> permissoes;

    public Grupo() {
        usuarios = new ArrayList<Usuario>();
        permissoes = new ArrayList<Permissao>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarPermissao(Permissao permissao) {
        permissoes.add(permissao);
    }
}
    