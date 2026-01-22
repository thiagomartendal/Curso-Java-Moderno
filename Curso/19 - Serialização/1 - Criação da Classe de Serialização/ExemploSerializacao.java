import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExemploSerializacao {

    // Método para serializar os contatos
    private static void serializarContato(List<Contato> listaContatos) throws IOException {
        // try com recursos - try-with-resources - fecha automaticamente os recursos que foram abertos na assinatura ao fim do bloco try
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("agenda.ser"))) {
            outputStream.writeObject(listaContatos);
            System.out.println("Contatos serializados e salvos com sucesso!");
        }
    }

    // Método para deserializar e exibir os contatos
    @SuppressWarnings("unchecked")
    private static void deserializarContatos() throws IOException, ClassNotFoundException {
        // ClassNotFoundException: Exceção que indica que a classe-tipo de conversão não foi encontrada
        // Caso a classe Contato não tenha sido definida, a exceção ClassNotFoundException é lançada
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("agenda.ser"))) { // try com recursos - try-with-resources
            List<Contato> contatosLidos = (List<Contato>) inputStream.readObject();
            for (Contato contato: contatosLidos)
                System.out.println("Nome: " + contato.nome + ", Telefone: " + contato.telefone);

            // Código de leitura que não necessita o uso de @SuppressWarnings("unchecked")
            // Object obj = inputStream.readObject();
            // if (obj instanceof List<?>) {
            //     List<?> contatosLidos = (List<?>) obj;
            //     for (Object contato: contatosLidos)
            //         if (contato instanceof Contato) {
            //             Contato contatoTyped = (Contato) contato;
            //             System.out.println("Nome: " + contatoTyped.nome + ", Telefone: " + contatoTyped.telefone);
            //         }
            // }
        }
    }

    public static void main(String[] args) {
        Contato contato1 = new Contato("Usuário 1", "12345678");
        Contato contato2 = new Contato("Usuário 2", "87654321");
        Contato contato3 = new Contato("Usuário 3", "75362814");

        List<Contato> listaContatos = new ArrayList<>();
        listaContatos.add(contato1);
        listaContatos.add(contato2);
        listaContatos.add(contato3);

        try {
            serializarContato(listaContatos);
            deserializarContatos();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao manipular contatos: " + e.getMessage());            
        }
    }

}