abstract class Carro {
    int codigo = 10;

    abstract void acelerar(); // Todo método abstrato deve ser implementado nas classes que extendem a classe abstrata

    void frear() {
        System.out.println("O carro está freando...");
    }
}

class CarroF1 extends Carro {
    void acelerar() {
        System.out.println("O carro de Fórmula 1 está acelerando...");
    }
}

class Caminhao extends Carro {
    void acelerar() {
        System.out.println("O caminhão está acelerando...");
    }
}

public class TesteClasseAbstrata {

    public static void main(String[] args) {
        // Carro carro = new Carro(); // Classes abstratas não podem ser instanciadas diretamente

        Caminhao caminhao = new Caminhao();

        System.out.println("Código: " + caminhao.codigo);

        caminhao.codigo = 888;

        System.out.println("Código: " + caminhao.codigo);
    }

}