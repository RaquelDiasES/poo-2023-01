package com.github.raqueldiases.ufg.poo;

import java.util.ArrayList;
import java.util.List;

class Janela {
     private List<ElementoInteracao> elementos;

    public Janela() {
        elementos = new ArrayList<>();
    
        elementos.add(new Botao());
        elementos.add(new Menu());
        elementos.add(new BarraRolagem());
    }
}