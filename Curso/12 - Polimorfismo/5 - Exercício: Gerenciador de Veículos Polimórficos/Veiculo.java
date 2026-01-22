abstract class Veiculo {
    private String placa;
    private int ano;

    Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    void exibirInformacoes() {
        System.out.println("Placa: " + placa + " - Ano: " + ano);
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }
}