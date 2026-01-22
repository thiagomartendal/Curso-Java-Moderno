import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import java.io.File;

/*
    Compilação de componentes de vídeo:

    javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.media ExemploVideo.java
    java --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.media ExemploVideo.java
*/

public class ExemploVideo extends Application {

    @Override
    public void start(Stage janela) {
        try {
            File videoFile = new File("Caminho do vídeo"); // Substituir por um vídeo real
            Media midia = new Media(videoFile.toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(midia);
            MediaView midiaView = new MediaView(mediaPlayer);

            HBox hbox = new HBox();
            hbox.getChildren().add(midiaView);
            hbox.setAlignment(Pos.CENTER);

            Scene cena = new Scene(hbox, 800, 600);

            janela.setTitle("Video");
            janela.setScene(cena);
            janela.show();

            mediaPlayer.play();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}