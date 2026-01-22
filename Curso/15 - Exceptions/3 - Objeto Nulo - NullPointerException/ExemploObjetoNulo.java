public class ExemploObjetoNulo {
    
    public static void main(String[] args) {
        String nome = null;
        // String nome; // Erro de compilação: A variável nome não foi inicializada, o que causa erro. Variáveis locais sempre devem ser inicializadas.

        try {
            int tamanhoNome = nome.length(); // Tentando acessar objeto nulo
            System.out.println("Tamanho do nome: " + tamanhoNome);
        } catch (NullPointerException e) {
            System.out.println("Erro: A variável nome está nula.");
        }
    }

}