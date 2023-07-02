package github.raqueldiases.ufg.poo.T10;

public class Bike {
    String modelo;
    String cor;
    int aro;
    String marca;
    Pessoa pessoa = new Pessoa();

    String possuiDono(Pessoa pessoa){
        String dono = pessoa.nome;
        return dono;
    }
}
