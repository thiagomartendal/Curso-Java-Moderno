import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ExemploControle extends Application {

    @Override
    public void start(Stage janela) {
        Label label = new Label("Olá Mundo!");

        Button botao = new Button("Clique Aqui");

        TextField campoTexto = new TextField();

        VBox layout = new VBox(label, botao, campoTexto);

        Scene cena = new Scene(layout, 300, 200);

        janela.setScene(cena);

        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}