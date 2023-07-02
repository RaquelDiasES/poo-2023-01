package com.github.raqueldiases.ufg.poo.T11;

import java.util.ArrayList;

public class Compartimento {
    public int qntLivro;
    public int qntCD;
    public String livGuardados[];
    public String CDGuardados[];
    private CD cd;

    private ArrayList<Livro[]> livro = new ArrayList<Livro[]>();

    String[] guardaLivro( Livro livro, int posicao){
        
        livGuardados[posicao] = livro.nome; 
        return livGuardados;

    }

    String[] guardaCD(CD cd, int posicao){
        CDGuardados[posicao] = cd.nome; 
        return CDGuardados;

    }

    
    
}
