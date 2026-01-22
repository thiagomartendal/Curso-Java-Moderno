public class Aplicacao {

    public static void main(String[] args) {
        Personagem personagem = new Personagem("Personagem", 55);

        System.out.println(personagem.getNome() + " - " + personagem.getNivelDePoder());

        personagem.tentarAumentarNivelDePoder(3);
        personagem.mudarNome(personagem, "Guerreiro");

        System.out.println(personagem.getNome() + " - " + personagem.getNivelDePoder());

        personagem.aumentarNivelDePoder();
        System.out.println(personagem.getNome() + " - " + personagem.getNivelDePoder());
    }

}
