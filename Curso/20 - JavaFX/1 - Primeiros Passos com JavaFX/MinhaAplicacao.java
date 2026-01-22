import javafx.application.Application;
import javafx.stage.Stage;

/*
    Compilação e Execução

    javac --module-path "/usr/share/openjfx/lib" --add-modules javafx.controls MinhaAplicacao.java
    java --module-path "/usr/share/openjfx/lib" --add-modules javafx.controls MinhaAplicacao.java

    ou

    javac --module-path $PATH_TO_FX --add-modules javafx.controls MinhaAplicacao.java
    java --module-path $PATH_TO_FX --add-modules javafx.controls MinhaAplicacao.java

    Variável PATH_TO_FX definida em ~/.bashrc com o caminho /usr/share/openjfx/lib
*/

public class MinhaAplicacao extends Application {
    
    @Override
    public void start(Stage janela) {
        janela.setTitle("Janela");

        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}