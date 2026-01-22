public class Aplicacao {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("Volkswagen", "Golf");
        Carro carro3 = new Carro("Fiat", "Pulse", 2025);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
        carro3.exibirDetalhes();
    }

}
