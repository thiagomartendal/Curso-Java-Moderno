public class ExcecaoDivisaoPorZero {

    public static int calcularMedia(int totalNotas, int quantidadeAlunos) throws ArithmeticException {
        return totalNotas / quantidadeAlunos;
    }

    public static void main(String[] args) {
        int totalNotas = 10;
        int quantidadeAlunos = 0;

        try {
            int media = calcularMedia(totalNotas, quantidadeAlunos); // Divisão por zero
            System.out.println("Média das notas: " + media);
        } catch (ArithmeticException e) {
            System.out.println("Problema: Divisão por zero! " + e.getMessage() + ".");
        } finally {
            System.out.println("O programa terminou.");
        }
    }
    
}