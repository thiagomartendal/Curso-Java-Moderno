public class TesteEstatico {
    // Método estático sobrecarregado #1
    public static void exibirValor(int a) {
        System.out.println("O valor do inteiro é: " + a);
    }

    // Método estático sobrecarregado #2
    public static void exibirValor(String str) {
        System.out.println("A string é: " + str);
    }

    public static void main(String[] args) {
        // Métodos não-estáticos não podem ser chamados dentro de um método estático, é necessário instânciar um novo objeto para chamar métodos não-estáticos

        TesteEstatico.exibirValor(10);
        TesteEstatico.exibirValor("Olá Mundo!");
    }
}