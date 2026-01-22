// Interface
interface Veiculo {
    void acelerar();
}

// Subclasse Carro
class Carro implements Veiculo {
    public void acelerar() {
        System.out.println("O carro está acelerando!");
    }
}

// Subclasse Moto
class Moto implements Veiculo {
    public void acelerar() {
        System.out.println("A moto está acelerando!");
    }
}

// Classe Principal
public class TestePolimorfismoInterface {

    public static void main(String[] args) {
        // Criando objetos polimórficos
        Veiculo meuCarro = new Carro();
        Veiculo minhaMoto = new Moto();

        meuCarro.acelerar();
        minhaMoto.acelerar();
    }
    
}