abstract class Carro {
    int codigo = 10;

    Carro(int cod) {
        codigo = cod;
    }

    abstract void acelerar(); // Todo método abstrato deve ser implementado nas classes que extendem a classe abstrata

    void frear() {
        System.out.println("O carro está freando...");
    }
}

class Caminhao extends Carro {
    Caminhao(int codigo) {
        super(codigo);
    }

    void acelerar() {
        System.out.println("O caminhão está acelerando...");
    }
}

public class TesteClasseAbstrata {

    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao(1000);

        System.out.println("Código: " + caminhao.codigo);
    }

}