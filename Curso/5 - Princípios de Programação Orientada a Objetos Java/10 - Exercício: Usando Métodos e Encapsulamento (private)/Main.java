public class Main {
    
    public static void main(String[] args) {
        Produto produto1 = new Produto("Café", 2.50, 15);

        System.out.println(produto1.getNome() + " - " + produto1.getPreco() + " - " + produto1.getQuantidadeEmEstoque());

        produto1.setPreco(3.25);

        System.out.println(produto1.getNome() + " - " + produto1.getPreco() + " - " + produto1.getQuantidadeEmEstoque());
    }

}
