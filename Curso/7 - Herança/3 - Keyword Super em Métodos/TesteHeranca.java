class Animal {
    public String nome;

    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

class Cachorro extends Animal {
    public void fazerSom() {
        super.fazerSom();
        System.out.println("O cachorro late");
    }
}

public class TesteHeranca {
    
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        
        cachorro.nome = "Cachorro";
        System.out.println("O nome do animal: " + cachorro.nome);

        cachorro.fazerSom();
    }

}