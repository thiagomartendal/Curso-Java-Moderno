public class Main {

    public static void main(String[] args) {
        int a = 10;

        if (a > 5) {
            System.out.println("a é maior que 5");
        } else {
            System.out.println("a é menor ou igual a 5");
        }

        // Operador Ternário:
        int numero = 10;
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
 
        System.out.println("O número é " + numero + ": " + resultado);
    }

}