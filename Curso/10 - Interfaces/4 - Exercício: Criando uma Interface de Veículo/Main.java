public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Caminhao caminhao = new Caminhao();

        carro.iniciar();
        caminhao.iniciar();

        carro.buzinar();
        caminhao.buzinar();

        carro.parar();
        caminhao.parar();
    }

}
