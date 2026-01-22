class CaixaDeBrinquedo {
    private Object coisaNaCaixa;

    public void guardar(Object coisa) {
        this.coisaNaCaixa = coisa;
    }

    public Object pegar() {
        return coisaNaCaixa;
    }

    public static void main(String[] args) {
        // Criando uma caixa de Carrinhos
        CaixaDeBrinquedo caixaDeCarrinhos = new CaixaDeBrinquedo();
        caixaDeCarrinhos.guardar(new Carrinho("Hot Wheels"));

        // Criando uma caixa de bonecas
        CaixaDeBrinquedo caixaDeBonecas = new CaixaDeBrinquedo();
        caixaDeBonecas.guardar(new Boneca("Barbie"));

        // Verificar o tipo do objeto antes de fazer os cast
        
        if (caixaDeCarrinhos.pegar() instanceof Carrinho) {
            Carrinho carrinho = (Carrinho)caixaDeCarrinhos.pegar();
            System.out.println(carrinho.getModelo());
        }

        if (caixaDeBonecas.pegar() instanceof Boneca) {
            Boneca boneca = (Boneca)caixaDeBonecas.pegar();
            System.out.println(boneca.getNome());
        }
    }

}
