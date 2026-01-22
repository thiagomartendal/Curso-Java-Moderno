import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.stage.FileChooser;
import java.io.File;

public class ExemploFIleChooser extends Application {
    
    @Override
    public void start(Stage janela) {
        FileChooser seletorDeArquivos = new FileChooser();
        seletorDeArquivos.setTitle("Escolha um arquivo");

        Button abrir = new Button("Abrir Arquivo");
        abrir.setOnAction(e -> {
            File arquivoSelecionado = seletorDeArquivos.showOpenDialog(janela);
            if (arquivoSelecionado != null) {
                exibirImagem(arquivoSelecionado, janela);
            }
        });

        VBox layout = new VBox(abrir);
        layout.setAlignment(Pos.CENTER);

        Scene cena = new Scene(layout, 800, 600);

        janela.setTitle("Seletor de Arquivos");
        janela.setScene(cena);
        janela.show();
    }

    private void exibirImagem(File arquivo, Stage janela) {
        Image imagem = new Image(arquivo.toURI().toString());
        ImageView view = new ImageView(imagem);

        VBox layout;

        // Recupera a VBox definida em start
        layout = (VBox) janela.getScene().getRoot();

        // Adiciona imagem ao layout
        layout.getChildren().add(view);

        // Ajustar o tamanho da imagem
        view.setFitWidth(500);
        view.setFitHeight(500);

        janela.setTitle("Imagem Selecionada");
    }

    public static void main(String[] args) {
        launch(args);
    }

}
