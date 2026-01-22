import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JogoDaForca {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> palavrasSecretas = new ArrayList<>(); // ArrayList que irá conter 3 palavras secretas
        palavrasSecretas.add("cobra"); // cobra está no índice 0 e tem 5 letras
        palavrasSecretas.add("elefante"); // elefante está no índice 1 e tem 8 letras
        palavrasSecretas.add("girafa"); // girafa está no índice 2 e tem 6 letras

        Random random = new Random();
        int tamanhoArrayList = palavrasSecretas.size();
        int indicePalavra = random.nextInt(tamanhoArrayList); // Gera o índice aleatório da palavra secreta
        String palavraSecreta = palavrasSecretas.get(indicePalavra); // Seleciona a palavra secreta

        ArrayList<Character> letrasDescobertas = new ArrayList<>(); // ArrayList para armazenar as letras descobertas
        for (int i = 0; i < palavraSecreta.length(); i++)
            letrasDescobertas.add('_'); // Inicializa com traços cada letra

        int tentativas = 6; // Número máximo de tentativas
        boolean palavraFoiDescoberta = false; // Flag para verificar se a palavra foi descoberta

        // Enquanto a palavra não for descoberta ou ainda houver tentativas para descobrir, o programa continuará
        while (!palavraFoiDescoberta && tentativas > 0) {
            System.out.println();
            System.out.println("Palavra: " + letrasDescobertas);
            System.out.print("Escolha uma letra: ");
            char tentativa = scanner.next().charAt(0);

            boolean acertou = false;
            for (int i = 0; i < palavraSecreta.length(); i++) { // Passar por cada letra da palavra
                if (palavraSecreta.charAt(i) == tentativa) { // Verifica se a letra na posição i da palavra secreta é igual a tentativa
                    letrasDescobertas.set(i, tentativa); // Se for igual, é colocada na lista de descobertas na posição correta
                    acertou = true;
                }
            }

            if (!acertou) {
                tentativas--;
                System.out.println("Você tem mais " + tentativas + " tentativas.");
            }

            // Verifica se a palavra foi descoberta
            palavraFoiDescoberta = !letrasDescobertas.contains('_'); //
        }

        if (palavraFoiDescoberta)
            System.out.println("Parabéns, você acertou! A palavra era: " + palavraSecreta);
        else
            System.out.println("Você perdeu. A palavra era: " + palavraSecreta);
    }

}