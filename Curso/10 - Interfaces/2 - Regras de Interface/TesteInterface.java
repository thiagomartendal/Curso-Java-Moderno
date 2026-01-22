interface SerVivo {
    void respirar();
}

/*
    Quando uma interface A extende uma interface B, todos os métodos da interface B devem
    ser implementados nas classes que implementam a interface A
*/
interface Animal extends SerVivo {
    String DESCRICAO = "Animal é um ser vivo importante"; // Atributos definidos em interfaces são implicitamente public static final
    void fazerSom(); // Métodos definidos em interfaces são implicitamente public
    // private void fazerSom(); // O uso de modificadores de acesso diferentes de public e default não é permitido e causa erro
    // abstract void fazerSom(); // O uso da palavra abstract é opcional
}

/*
    A implementação dos métodos definidos em uma interface devem ter modificadores de acesso público
*/
class Cachorro implements Animal {
    public void respirar() {}

    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}

class Gato implements Animal {
    public void respirar() {}

    public void fazerSom() {
        System.out.println("O gato mia");
    }
}

public class TesteInterface {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.fazerSom();
        gato.fazerSom();

        // Animal animal = new Animal(); // Interfaces não podem ser instanciadas diretamente

        System.out.println("Descrição da interface: " + Animal.DESCRICAO);
    }

}