import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/*
    Compilação e execução:
    javac --module-path "/usr/share/openjfx/lib" --add-modules javafx.controls,javafx.web MiniNavegador.java
    java --module-path "/usr/share/openjfx/lib" --add-modules javafx.controls,javafx.web MiniNavegador
*/

public class MiniNavegador extends Application {
    
    @Override
    public void start(Stage janela) {
        TextField campoUrl = new TextField();
        WebView navegador = new WebView();
        WebEngine motor = navegador.getEngine();

        // Carregar uma página da web quando o usuário pressiona enter
        campoUrl.setOnAction(evento -> motor.load(formatarUrl(campoUrl.getText())));

        VBox vbox = new VBox();
        vbox.getChildren().addAll(campoUrl, navegador);

        Scene cena = new Scene(vbox);

        janela.setTitle("Navegador Java");
        janela.setScene(cena);
        janela.show();
    }

    // Método para inserir http
    public String formatarUrl(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }
        return url;
    }

    public static void main(String[] args) {
        launch(args);
    }

}