import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/*
    Compilação e execução:
    javac --module-path "/usr/share/openjfx/lib" --add-modules javafx.controls ExemploControle.java
    java --module-path "/usr/share/openjfx/lib" --add-modules javafx.controls ExemploControle
*/

public class ExemploControle extends Application {

    @Override
    public void start(Stage janela) {
        Label label = new Label("Olá Mundo!");
        label.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 14px; -fx-font-style: italic; -fx-font-weight: bold;");
        label.setStyle("-fx-background-color: blue; -fx-text-fill: pink;");

        Button botao = new Button("Clique Aqui");
        botao.setStyle("-fx-font-family: 'UnPilgi'; -fx-font-size: 12px;");
        botao.setStyle("-fx-background-color: rgba(255, 0, 0, 0.5); -fx-text-fill: white;");

        TextField campoTexto = new TextField();
        campoTexto.setStyle("-fx-font-family: 'Comic Neue Light'; -fx-font-size: 16px;");
        campoTexto.setStyle("-fx-background-color: green; -fx-text-fill: red;");

        VBox layout = new VBox(label, botao, campoTexto);

        Scene cena = new Scene(layout, 300, 200);

        janela.setScene(cena);

        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}