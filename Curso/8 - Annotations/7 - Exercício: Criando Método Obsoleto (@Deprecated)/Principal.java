public class Principal {

    public static void main(String[] args) {
        MinhaClasse classe = new MinhaClasse();

        int soma = classe.calcularSoma(45, 55);
        int produto = classe.calcularProduto(45, 55);

        System.out.println("Soma: " + soma + " - Produto: " + produto);
    }

}
