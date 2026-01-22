abstract class Loja {
    private int cnpj;
    private String razaoSocial;
    protected boolean aberto;

    Loja(int cnpj, String razaoSocial, boolean aberto) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberto = aberto;
    }

    abstract void abrir();

    abstract void fechar();

    int getCNPJ() {
        return cnpj;
    }

    String getRazaoSocial() {
        return razaoSocial;
    }
}