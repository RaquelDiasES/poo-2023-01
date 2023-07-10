package com.github.raqueldiases.ufg.poo.T13;

public class Pessoa {
    int idadePessoa;
    String nomePessoa;

    public Pessoa(int idade, String nome){
        idadePessoa = idade;
        nomePessoa = nome;
    }

    public static void pessoa(String[] args){
        Pessoa nomeIdade = new Pessoa(20, "Raquel");
        System.out.println(nomeIdade.idadePessoa + " " + nomeIdade.nomePessoa);
    } 
}

