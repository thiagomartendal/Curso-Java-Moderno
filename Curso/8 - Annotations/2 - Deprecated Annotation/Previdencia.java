class InformaRegras {
    @Deprecated // A anotação @Deprecated indica que o método é obsoleto (não deve ser usado)
    public void mostrarRegrasParaAposentadoria() {
        System.out.println("Regras para Aposentadoria");
    }
    
    public void mostrarNovasRegrasParaAposentadoria() {
        System.out.println("NOVAS Regras para Aposentadoria");
    }    
}

public class Previdencia {

    public static void main(String[] args) {
        InformaRegras regras = new InformaRegras();

        // Uso do método obsoleto
        regras.mostrarRegrasParaAposentadoria();

        // Uso do novo método
        regras.mostrarNovasRegrasParaAposentadoria();
    }
    
}