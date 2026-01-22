public class SomaInteiroPositivo {

    public static void main(String[] args) {
        int numero = 10, soma = 0;

        do {
            soma += numero--;
        } while(numero > 0);

        System.out.println("Soma total: " + soma);
    }

}
