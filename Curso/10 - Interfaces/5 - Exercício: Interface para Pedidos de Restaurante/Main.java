public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarItem("Hambúrguer", 12.50);
        pedido.adicionarItem("Batata Frita", 6.25);
        pedido.adicionarItem("Refrigerante", 4.00);

        for (int i = 0; i < 3; i++) {
            System.out.println(pedido.getItens()[i] + " - R$" + pedido.getPreco()[i]);
        }

        System.out.println("Valor total: R$" + pedido.calcularTotal());
    }

}
