class ExemploFinal {
    // Definição de constante - uso de final
    final int CODIGO_FIXO = 10;

    // Método final
    final void meuMetodo() {
        System.out.println("Este é um método final");
    }
}

public class TesteFinal {

    public static void main(String[] args) {
        ExemploFinal teste = new ExemploFinal();
        // teste.CODIGO_FIXO = 555; // Não é possível alterar o valor de uma variável final (constante)
        System.out.println("Valor da constante: " + teste.CODIGO_FIXO);
        teste.meuMetodo();

        final int finalLocal = 555;
        System.out.println("Valor da constante local: " + finalLocal);
    }
    
}