interface Animal {
    void fazerSom();
}

class Cachorro implements Animal {
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}

class Gato implements Animal {
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
    }

}