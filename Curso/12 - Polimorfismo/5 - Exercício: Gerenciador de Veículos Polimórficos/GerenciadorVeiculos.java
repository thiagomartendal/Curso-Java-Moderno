public class GerenciadorVeiculos {

    public static void main(String[] args) {
        Veiculo onibus = new Onibus("abc1234", 1974, 50);
        Veiculo caminhao = new Caminhao("xyz5678", 1980, 8);

        onibus.exibirInformacoes();
        caminhao.exibirInformacoes();
    }

}
