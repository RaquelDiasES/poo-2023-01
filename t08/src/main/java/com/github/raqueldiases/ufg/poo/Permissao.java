package com.github.raqueldiases.ufg.poo;

public class Permissao {


private Arquivo arquivo;


    public Permissao() {
    }

    public Arquivo getArquivo() {
        return arquivo;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }

private Grupo grupo;

    

    public Grupo getGrupo(){
        return grupo;
    }

    public void setGrupo(Grupo grupo){
        this.grupo = grupo;
    }

}