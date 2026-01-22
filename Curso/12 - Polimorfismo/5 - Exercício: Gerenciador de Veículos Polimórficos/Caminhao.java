class Caminhao extends Veiculo {
    private int eixos;

    Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    @Override
    void exibirInformacoes() {
        System.out.println("Placa: " + super.getPlaca() + " - Ano: " + super.getAno() + " - Eixos: " + eixos);
    }
}