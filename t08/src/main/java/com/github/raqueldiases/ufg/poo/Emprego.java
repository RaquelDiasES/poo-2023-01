package com.github.raqueldiases.ufg.poo;

public class Emprego {
    private Pessoa pessoa;
    private Empresa empresa;
    private double salario;
    private String intervaloDeTempo;

    public Emprego(Pessoa pessoa, Empresa empresa, double salario, String intervaloDeTempo) {
        this.pessoa = pessoa;
        this.empresa = empresa;
        this.salario = salario;
        this.intervaloDeTempo = intervaloDeTempo;
    }
}