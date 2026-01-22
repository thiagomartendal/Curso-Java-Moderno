import java.io.*;

public class ManipulacaoArquivos {

    private static void escreverNoArquivo(String nomeArquivo, String conteudo) throws IOException {
        // Escrevendo em um arquivo
        FileWriter writer = new FileWriter(nomeArquivo);
        writer.write(conteudo); // Grava os Dados
        writer.close();
    }

    private static String lerDoArquivo(String nomeArquivo) throws IOException {
        // Lendo de um arquivo
        FileReader reader = new FileReader(nomeArquivo);
        int data = reader.read();
     
        String str = new String();

        while (data != -1) {
            str += (char)data;     
            data = reader.read();
        }

        reader.close();

        return str;
    }

    public static void main(String[] args) { 
        try {
            String arquivo = "meuArquivo.txt";
            escreverNoArquivo(arquivo, "Olá, mundo!");
            String str = lerDoArquivo(arquivo);
            System.out.println(str);
        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }
    }

}