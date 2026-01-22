class Onibus extends Veiculo {
    private int assentos;

    Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    @Override
    void exibirInformacoes() {
        System.out.println("Placa: " + super.getPlaca() + " - Ano: " + super.getAno() + " - Assentos: " + assentos);
    }
}