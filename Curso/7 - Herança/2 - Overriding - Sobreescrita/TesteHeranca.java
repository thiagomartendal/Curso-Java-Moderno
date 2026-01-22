class Animal {
    public void fazerSom(int i, String s) {
        System.out.println("O animal faz um som");
    }
}

class Cachorro extends Animal {
    // A sobreescrita na classe filha é feita em métodos com o mesmo modificador de acesso, tipo, nome, e lista de parâmetros.
    public void fazerSom(int i, String s) { // Sobreescreveu fazerSom da classe Animal
        System.out.println("O cachorro late");
    }
}

public class TesteHeranca {
    
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom(0, "");
    }

}