import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

/*
    Compilação e execução:
    javac --module-path "/usr/share/openjfx/lib" --add-modules javafx.controls ListaCompra.java
    java --module-path "/usr/share/openjfx/lib" --add-modules javafx.controls ListaCompra
*/

public class ListaCompra extends Application {
    
    private ArrayList<String> listaCompras;
    private ListView<String> listaVisualizavel; // Para exibir os itens da lista de compras

    public ListaCompra() {
        listaCompras = new ArrayList<>();
        listaVisualizavel = new ListView<>();
    }

    @Override
    public void start(Stage janela) {
        janela.setTitle("Lista de Compras");

        TextField descricaoItem = new TextField();
        Button adicionar = new Button("Adicionar");
        Button exportar = new Button("Exportar Lista");

        Label labelAdicionar = new Label("Digite o item que deseja adicionar:");
        Label labelListaCompras = new Label("Lista de Compras:");

        // Criação do objeto ObservableList a partir de listaCompras
        ObservableList<String> observableListaCompras = FXCollections.observableArrayList(listaCompras);
        listaVisualizavel.setItems(observableListaCompras);

        VBox vbox = new VBox();
        vbox.getChildren().addAll(labelAdicionar, descricaoItem, adicionar);
        vbox.getChildren().addAll(labelListaCompras, listaVisualizavel, exportar);
        vbox.setSpacing(10); // Espaçamento vertical entre os componentes
        vbox.setPadding(new Insets(10)); // Margens internas (espaçamento) para o VBox

        adicionar.setOnAction(e -> {
            String item = descricaoItem.getText(); // Obtém o texto digitado e armazena em item
            if (!item.isEmpty()) { // Entra no if se o texto não está vazio
                listaCompras.add(item); // O texto digitado é adicionado à listaCompras
                listaVisualizavel.getItems().add(item); // Adiciona o texto à listaVisualizavel
                descricaoItem.clear(); // Limpa o campo de texto
            }
        });

        exportar.setOnAction(e -> {
            try {
                File arquivo = new File("ListaDeCompras.txt");
                PrintWriter writer = new PrintWriter(arquivo); // PrintWriter é usado para gravar os itens da lista no arquivo
                for (String item: listaCompras) { // Percorre todos os itens da lista
                    writer.println(item); // Escreve o item em uma linha do arquivo
                }
                writer.close();
            } catch (Exception exp) {
                System.err.println("Erro: " + exp.getMessage());
            }
        });

        Scene cena = new Scene(vbox, 350, 300);
        janela.setScene(cena);
        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}