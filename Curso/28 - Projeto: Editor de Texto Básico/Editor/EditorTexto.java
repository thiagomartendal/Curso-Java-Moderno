import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.PrintWriter;

/*
    Compilação e execução:
    javac --module-path "/usr/share/openjfx/lib" --add-modules javafx.controls EditorTexto.java
    java --module-path "/usr/share/openjfx/lib" --add-modules javafx.controls EditorTexto
*/

public class EditorTexto extends Application {
    
    @Override
    public void start(Stage janela) {
        // Criação da TextArea para o editor de texto
        TextArea areaEditavel = new TextArea();

        // Botão para salvar o texto
        Button botaoSalvar = new Button("Salvar");
        botaoSalvar.setOnAction(e -> salvarTexto(areaEditavel));

        // Barra de ferramentas com o botão salvar
        ToolBar barraDeFerramentas = new ToolBar(botaoSalvar);

        // Configuração do layout principal
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(barraDeFerramentas);
        borderPane.setCenter(areaEditavel);

        // Configuração da cena e da janela
        Scene cena  = new Scene(borderPane, 800, 600);

        janela.setTitle("Editor de Texto");
        janela.setScene(cena);
        janela.show();
    }

    private void salvarTexto(TextArea textArea) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Salvar Arquivo de Texto");

        File file = fileChooser.showSaveDialog(null);
        if (file != null) {
            try (PrintWriter writer = new PrintWriter(file)) {
                writer.println(textArea.getText());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
