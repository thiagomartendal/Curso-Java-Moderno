public class PrecedenciaOperadoresAtribuicao {

    public static void main(String[] args) {
        int numero = 5;
        System.out.println(numero);

        System.out.println("Pré-Incremento: " + (++numero));
        System.out.println("Pós-Incremento: " + (numero++));
        System.out.println("Valor após o incremento: " + numero);
        System.out.println("Pré-Decremento: " + (--numero));
        System.out.println("Pós-Decremento: " + (numero--));
        System.out.println("Valor após o decremento: " + numero);
    }

}
