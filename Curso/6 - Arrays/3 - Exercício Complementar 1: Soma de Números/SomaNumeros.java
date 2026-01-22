public class SomaNumeros {
    
    public static void main(String[] args) {
        int[] numeros = new int[1000];
        int soma = 0;
        for (int i = 1; i <= 1000; i++) {
            numeros[i-1] = i;
            soma += i;
        }
        
        System.out.println("Soma total: " + soma);
    }

}
