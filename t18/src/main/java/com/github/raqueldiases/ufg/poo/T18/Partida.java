package main.java.com.github.raqueldiases.ufg.poo.T18;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    private Tabuleiro tabuleiro;
    private List<Lance> lances;

    public Partida() {
        this.tabuleiro = new Tabuleiro();
        this.lances = new ArrayList<>();
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    
     public void adicionarLance(Lance lance) {
        lances.add(lance);
    }

    public void removerLance(Lance lance) {
        lances.remove(lance);
    }

    public List<Lance> getLances() {
        return lances;
    }
}
