import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

/*
    Compilação e execução:

    javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.web ExemploVideoStreaming.java
    java --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.web ExemploVideoStreaming.java

*/

public class ExemploVideoStreaming extends Application {

    @Override
    public void start(Stage janela) {
        WebView webView = new WebView();

        String urlVideo = "https://www.youtube.com/watch?v=H-kA3UtBj4M&list=RDH-kA3UtBj4M";

        webView.getEngine().load(urlVideo);

        Scene cena = new Scene(webView, 800, 600);

        janela.setTitle("Streaming");
        janela.setScene(cena);
        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}