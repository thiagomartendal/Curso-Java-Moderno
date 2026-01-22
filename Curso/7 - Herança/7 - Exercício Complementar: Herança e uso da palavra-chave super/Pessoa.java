class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    protected String getNome() {
        return nome;
    }

    protected int getIdade() {
        return idade;
    }
}