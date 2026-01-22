import java.nio.file.*;
import java.io.IOException;

public class ExemploNIO {

    public static void main(String[] args) {
        Path path = Paths.get("meuArquivo.txt");

        try {
            // Escrevendo em um arquivo
            Files.write(path, "Olá Mundo!".getBytes());

            // Lendo de um arquivo
            byte[] bytes = Files.readAllBytes(path);

            String conteudo = new String(bytes);

            System.out.println(conteudo);
        } catch (IOException e) {
            System.err.println("Problemas de IO: " + e.getMessage());
        }
    }

}
