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
        label.getStyleClass().add("etiqueta");

        Button botao = new Button("Clique Aqui");
        botao.getStyleClass().add("botao");

        TextField campoTexto = new TextField();
        campoTexto.getStyleClass().add("campoTexto");

        VBox layout = new VBox(label, botao, campoTexto);

        Scene cena = new Scene(layout, 300, 200);
        cena.getStylesheets().add("/css/styles.css");

        janela.setScene(cena);

        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}