import java.io.*;

public class ExemploIO {

    public static void main(String[] args) {
        try {
            // Escrevendo um arquivo
            FileWriter writer = new FileWriter("meuArquivo.txt");

            writer.write("Olá Mundo!");

            writer.close();

            // Lendo de um arquivos
            FileReader reader = new FileReader("meuArquivo.txt");

            int data = reader.read(); // Lê o primeiro caractere do arquivo

            while (data != -1) { // Repete enquanto houver caracteres (-1 indica o fim do arquivo - EOF)
                System.out.print((char)data);
                data = reader.read(); // Lê o próximo caractere do arquivo
            }

            System.out.println();

            reader.close();
        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }
    }

}
