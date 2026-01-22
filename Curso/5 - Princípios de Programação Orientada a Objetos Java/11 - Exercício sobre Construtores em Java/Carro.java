public class Carro {
    private String marcaDoCarro;
    private String modeloDoCarro;
    private int anoDoCarro;
    
    Carro() {
        this.marcaDoCarro = "Desconhecida";
        this.modeloDoCarro = "Desconhecido";
        this.anoDoCarro = 0;
    }

    public Carro(String marcaDoCarro, String modeloDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = 0;
    }

    public Carro(String marcaDoCarro, String modeloDoCarro, int anoDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marcaDoCarro + " - Modelo: " + modeloDoCarro + " - Ano: " + anoDoCarro);
    }
}
