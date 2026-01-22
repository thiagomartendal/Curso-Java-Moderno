abstract class Animal {
    public abstract void fazerSom();
}

class Cachorro extends Animal {
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}

class Gato extends Animal {
    public void fazerSom() {
        System.out.println("O gato mia");
    }
}

public class TestePolimorfismo {
    
    public static void main(String[] args) {
        // Criando objetos polimórficos

        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.fazerSom();
        gato.fazerSom();
    }

}