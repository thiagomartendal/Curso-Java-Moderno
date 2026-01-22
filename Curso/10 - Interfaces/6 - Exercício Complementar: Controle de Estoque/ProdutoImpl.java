class ProdutoImpl implements Produto {
    String nome;
    int quantidade;

    ProdutoImpl(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    @Override
    public void removerQuantidade(int quantidade) {
        if (this.quantidade >= quantidade)
            this.quantidade -= quantidade;
        else
            System.out.println("A quantidade fornecida é superior a em estoque.");
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }
}
