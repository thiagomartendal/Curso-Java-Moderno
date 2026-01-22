public class Main {

    public static void main(String[] args) {
        int totalNotas = 100;
        int quantidadeAlunos = 0;

        try {
            int media = totalNotas / quantidadeAlunos; // Divisão por zero
            System.out.println(media);
        } catch (ArithmeticException _) { // Trocamos e por _
            System.out.println("Problema: Divisão por zero!");
        }
    }
    
}