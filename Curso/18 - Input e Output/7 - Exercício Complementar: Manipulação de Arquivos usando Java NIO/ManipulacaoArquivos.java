import java.nio.file.*;
import java.io.IOException;

public class ManipulacaoArquivos {

    private static void escreverNoArquivo(String nomeArquivo, String conteudo) throws IOException {
        // Escrevendo em um arquivo
        Path path = Paths.get(nomeArquivo);
        Files.write(path, conteudo.getBytes());
    }

    private static String lerDoArquivo(String nomeArquivo) throws IOException {
        // Lendo de um arquivo
        Path path = Paths.get(nomeArquivo);
        byte[] bytes = Files.readAllBytes(path);
        String str = new String(bytes);
        return str;
    }

    public static void main(String[] args) { 
        try {
            String arquivo = "meuArquivo.txt";
            escreverNoArquivo(arquivo, "Olá, mundo!");
            String str = lerDoArquivo(arquivo);
            System.out.println("Conteúdo lido do arquivo: " + str);
        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }
    }

}