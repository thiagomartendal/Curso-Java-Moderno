class Pedido implements PedidoRestaurante {
    private String[] itens;
    private double[] precos;
    private int indice;

    Pedido() {
        itens = new String[10];
        precos = new double[10];
        indice = 0;
    }

    @Override
    public void adicionarItem(String item, double preco) {
        itens[indice] = item;
        precos[indice] = preco;
        indice++;
    }

    @Override
    public double calcularTotal() {
        double total = 0.00;
        for (double preco: precos)
            total += preco;
        return total;
    }

    public String[] getItens() {
        return itens;
    }

    public double[] getPreco() {
        return precos;
    }
}