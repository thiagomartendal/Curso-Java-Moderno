public class TesteExcecaoArray {

    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3}; // Índices: 0, 1, 2
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Erro: " + e.getMessage() + ".");
        } finally {
            System.out.println("Programa finalizado.");
        }
    }

}