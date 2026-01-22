class InformaRegras {
    @Deprecated
    public void mostrarRegrasParaAposentadoria() {
        System.out.println("Regras para Aposentadoria");
    }
    
    public void mostrarNovasRegrasParaAposentadoria() {
        System.out.println("NOVAS Regras para Aposentadoria");
    }

    public void chamarMetodoObsoletoNaMesmaClasse() {
        /*
            Como a chamada do método defasado é feita na mesma classe em que este foi definido, o compilador não emite avisos,
            pois assume que o programador tem total controle e ciência sobre o método defasado.
        */
        mostrarRegrasParaAposentadoria();
    }
}

public class TesteDefasado {

    public static void main(String[] args) {
        InformaRegras regras = new InformaRegras();

        regras.chamarMetodoObsoletoNaMesmaClasse();
    }
    
}