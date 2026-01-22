public class Main {

    public static void main(String[] args) {
        int idade = 15; // idade para verificação
 
        if (idade < 18) {
            throw new RuntimeException("Idade deve ser 18 ou maior.");
        }
 
        System.out.println("Idade válida: " + idade);
    }
    
}
