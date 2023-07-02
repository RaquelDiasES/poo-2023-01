package com.github.raqueldiases.ufg.poo;

import java.util.ArrayList;
import java.util.List;

class Curva {
    private List<Ponto> pontos;

    public Curva() {
        this.pontos = new ArrayList<>();
    }

    public void adicionarPonto(Ponto ponto) {
        pontos.add(ponto);
    }