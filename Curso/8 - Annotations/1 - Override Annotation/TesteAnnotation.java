class Animal {
    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

class Cachorro extends Animal {
    @Override // Indica a sobreescrita do método, para não se confundir com a sobrecarga
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}

public class TesteAnnotation {
    
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();
    }

}