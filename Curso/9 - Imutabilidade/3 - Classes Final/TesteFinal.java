// Classes final não podem ter seu comportamento modificado
final class ExemploFinal {
    // Definição de constante - uso de final
    final int CODIGO_FIXO = 10;

    // Método final
    final void meuMetodo() {
        System.out.println("Este é um método final");
    }
}

// Erro: classes final não podem ser extendidas
public class TesteFinal extends ExemploFinal {

    public static void main(String[] args) {
        ExemploFinal teste = new ExemploFinal();
        teste.meuMetodo();
    }
    
}