import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RelogioDigital extends Application {
    final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void start(Stage janela) {
        Label rotuloTempo = new Label();
        rotuloTempo.setStyle("-fx-font-size: 24pt; -fx-text-fill: yellow;");

        // Criação de um KeyFrame
        KeyFrame atualizar = new KeyFrame(Duration.ZERO, e -> {
            rotuloTempo.setText(LocalDateTime.now().format(FORMATADOR));
        });

        // Criação de outro KeyFrame que define o intervalo de atualização
        KeyFrame intervalo = new KeyFrame(Duration.seconds(1));

        // Criação da Timeline e adição dos KeyFrames
        Timeline relogio = new Timeline();
        relogio.getKeyFrames().addAll(atualizar, intervalo);

        // A atualização do rótulo com a hora atual ocorre a cada segundo
        relogio.setCycleCount(Animation.INDEFINITE);
        relogio.play(); // Inicia a Timeline

        VBox layout = new VBox(rotuloTempo);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-background-color: black;");

        Scene cena = new Scene(layout, 210, 100);

        janela.setTitle("Relógio Digital");
        janela.setScene(cena);
        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}