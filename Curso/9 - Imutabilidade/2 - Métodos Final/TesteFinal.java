class ExemploFinal {
    // Definição de constante - uso de final
    final int CODIGO_FIXO = 10;

    // Método final
    final void meuMetodo() {
        System.out.println("Este é um método final");
    }
}

public class TesteFinal extends ExemploFinal {

    // Erro: métodos final não podem ser sobreescritos ou sobrecarregados
    // final void meuMetodo() { 
    //     System.out.println("Método sobreescrito");
    // }

    public static void main(String[] args) {
        ExemploFinal teste = new ExemploFinal();
        teste.meuMetodo();
    }
    
}