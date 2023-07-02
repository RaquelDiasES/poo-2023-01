public class Pessoa {
    private String nome;
    private int idade;
    private List<Habito> habitos;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.habitos = new ArrayList<>();
    }

    public void adicionarHabito(String descricao) {
        Habito habito = new Habito(descricao);
        habitos.add(habito);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public List<Habito> getHabitos() {
        return habitos;
    }
    
}