import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class ExemploGridPane extends Application {
    
    @Override
    public void start(Stage janela) {
        // Criação dos elementos
        Label rotuloNome = new Label("Nome:");
        Label rotuloEmail = new Label("Email:");
        TextField campoNome = new TextField();
        TextField campoEmail = new TextField();
        Button botaoEnviar = new Button("Enviar");

        // Criação do GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(8); // Espaçamento horizontal entre células
        gridPane.setVgap(8); // Espaçamento vertical entre células
        gridPane.setPadding(new Insets(5)); // Espaçamento externo

        // Adição dos elementos ao GridPane
        gridPane.addRow(0, rotuloNome, campoNome);
        gridPane.addRow(1, rotuloEmail, campoEmail);
        gridPane.addRow(2, botaoEnviar);

        // Criação da cena e exibição da janela
        Scene cena = new Scene(gridPane, 400, 200);
        janela.setScene(cena);
        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}