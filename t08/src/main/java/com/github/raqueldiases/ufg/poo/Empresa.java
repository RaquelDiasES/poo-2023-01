package com.github.raqueldiases.ufg.poo;

public class Empresa {
    private List<Emprego> empregosOferecidos;

    public Empresa() {
        empregosOferecidos = new ArrayList<>();
    }

    public void oferecerEmprego(Emprego emprego) {
        empregosOferecidos.add(emprego);
    }

     public List<Emprego> getEmpregosOferecidos() {
        return empregosOferecidos;
    }
}