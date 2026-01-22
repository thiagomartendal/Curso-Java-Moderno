import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ExemploImagem extends Application {

    @Override
    public void start(Stage janela) {
        // Caminho absoluto
        String caminhoImagem = "Caminho da imagem"; // Substituir por uma imagem real

        Image imagem = new Image(caminhoImagem);
        ImageView view = new ImageView(imagem);

        // Configuração para ajustar o tamanho da imagem
        view.setFitWidth(613); // Largura
        view.setFitHeight(640); // Altura
        view.setPreserveRatio(true); // Mantém a proporção original da imagem

        VBox layout = new VBox(view);
        layout.setAlignment(Pos.CENTER);

        Scene cena = new Scene(layout, 700, 700);
        
        janela.setScene(cena);
        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
