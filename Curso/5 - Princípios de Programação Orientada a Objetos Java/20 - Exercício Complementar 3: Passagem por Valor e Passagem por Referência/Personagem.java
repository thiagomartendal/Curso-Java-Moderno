public class Personagem {
    private String nome;
    private int nivelDePoder;
    
    public Personagem(String nome, int nivelDePoder) {
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
    }

    public void tentarAumentarNivelDePoder(int nivelDePoder) {
        nivelDePoder += 10;
    }

    public void aumentarNivelDePoder() {
        nivelDePoder += 10;
    }

    public void mudarNome(Personagem personagem, String nome) {
        personagem.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getNivelDePoder() {
        return nivelDePoder;
    }
}
