package com.github.raqueldiases.ufg.poo;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private List<Emprego> empregos;

    public Pessoa() {
        empregos = new ArrayList<>();
    }

    public void adicionarEmprego(Emprego emprego) {
        empregos.add(emprego);
    }
}