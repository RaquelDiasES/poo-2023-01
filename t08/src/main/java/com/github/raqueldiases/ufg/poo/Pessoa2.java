package com.github.raqueldiases.ufg.poo;

import java.util.ArrayList;
import java.util.List;

public class Pessoa2 {
    private List<Emprego> empregos;

    public Pessoa2() {
        empregos = new ArrayList<>();
    }

    public void adicionarEmprego(Emprego emprego) {
        empregos.add(emprego);
    }
}