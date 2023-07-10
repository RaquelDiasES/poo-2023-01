package main.java.com.github.raqueldiases.ufg.poo.T18;

public class Lance {
    private Jogador jogador;
    private Peca peca;
    private Posicao origem;
    private Posicao destino;

    public Lance(Jogador jogador, Peca peca, Posicao origem, Posicao destino) {
        this.jogador = jogador;
        this.peca = peca;
        this.origem = origem;
        this.destino = destino;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    public Peça getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public Posicao getOrigem() {
        return origem;
    }

    public void setOrigem(Posicao origem) {
        this.origem = origem;
    }

    public Posicao getDestino() {
        return destino;
    }

    public void setDestino(Posicao destino) {
        this.destino = destino;
    }
}
