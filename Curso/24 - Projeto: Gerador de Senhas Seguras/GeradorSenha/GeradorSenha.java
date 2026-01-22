import java.security.SecureRandom;
import java.util.Scanner;

public class GeradorSenha {

    private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*()_+-=[]|,./?><";

    public static String gerarSenha(int comprimento) {
        SecureRandom geradorNumeroAleatorio = new SecureRandom();
        StringBuilder senha = new StringBuilder(comprimento);

        for (int i = 0; i < comprimento; i++) {
            int indice = geradorNumeroAleatorio.nextInt(CARACTERES.length());
            senha.append(CARACTERES.charAt(indice));
        }

        return senha.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um scanner para ler entradas do teclado
        System.out.print("Digite o comprimento da senha que deseja: ");
        int comprimento = scanner.nextInt(); // Lê o comprimento da senha

        String senha = gerarSenha(comprimento);
        System.out.println("Senha gerada: " + senha);
    }

}