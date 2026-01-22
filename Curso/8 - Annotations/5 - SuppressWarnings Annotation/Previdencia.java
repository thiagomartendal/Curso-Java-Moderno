// @SuppressWarnings não exibe avisos sobre recursos indicados

class InformaRegras {
    @Deprecated
    public void mostrarRegrasParaAposentadoria() {
        System.out.println("Regras para Aposentadoria");
    }
    
    public void mostrarNovasRegrasParaAposentadoria() {
        System.out.println("NOVAS Regras para Aposentadoria");
    }    
}

public class Previdencia {

    @SuppressWarnings("deprecation") // Indica que avisos e notas sobre o uso de recursos marcados com @Deprecated devem ser ignorados
    public static void main(String[] args) {
        InformaRegras regras = new InformaRegras();

        // Uso do método obsoleto
        regras.mostrarRegrasParaAposentadoria();

        // Uso do novo método
        regras.mostrarNovasRegrasParaAposentadoria();
    }
    
}