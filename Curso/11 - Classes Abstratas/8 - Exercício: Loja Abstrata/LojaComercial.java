class LojaComercial extends Loja {
    public LojaComercial(int cnpj, String razaoSocial, boolean aberto) {
        super(cnpj, razaoSocial, aberto);
    }

    public void abrir() {
        if (!aberto)
            aberto = true;
        else
            System.out.println("A loja já está aberta.");
    }

    public void fechar() {
        if (aberto)
            aberto = false;
        else
            System.out.println("A loja já está fechada.");
    }
}