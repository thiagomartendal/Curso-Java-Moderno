class Animal {
    public void comer() {
        System.out.println("O animal come");
    }
}

class Cachorro extends Animal {
    public void latir() {
        System.out.println("O cachorre late");
    }
}

public class TesteHeranca {
    
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.latir();
        cachorro.comer();
    }

}