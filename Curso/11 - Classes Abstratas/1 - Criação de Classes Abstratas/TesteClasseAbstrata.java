abstract class Carro {
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
        CarroF1 carroF1 = new CarroF1();
        Caminhao caminhao = new Caminhao();

        carroF1.acelerar();
        carroF1.frear();

        caminhao.acelerar();
        caminhao.frear();
    }

}