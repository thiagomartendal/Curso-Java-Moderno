public class Main {

    public static void exibir(Produto produto) {
        System.out.println("Produto: " + produto.getNome() + " - Quantidade: " + produto.getQuantidade());
    }

    public static void main(String[] args) {
        ProdutoImpl produto = new ProdutoImpl("Arroz", 80);

        exibir(produto);

        produto.adicionarQuantidade(55);

        exibir(produto);

        produto.removerQuantidade(22);

        exibir(produto);

        produto.removerQuantidade(150);

        exibir(produto);
    }
    
}
