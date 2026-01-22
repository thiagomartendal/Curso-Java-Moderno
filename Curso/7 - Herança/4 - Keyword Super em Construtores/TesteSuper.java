class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }
}

class Cachorro extends Animal {
    String raca;

    Cachorro(String nome, String raca) {
        super(nome); // Chama o construtor da superclasse Animal
        this.raca = raca;
    }
}

public class TesteSuper {
    
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Cachorro", "Raça");

        System.out.println("O nome do animal: " + cachorro.nome);
        System.out.println("A raça do cachorro: " + cachorro.raca);
    }

}