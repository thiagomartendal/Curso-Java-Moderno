import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import geradorSenha.GeradorSenha;

public class InterfaceGraficaGeradorSenha extends Application {
    
    @Override
    public void start(Stage janela) {
        janela.setTitle("Gerador de Senhas");
        
        Label labelTamanhoSenha = new Label("Tamanho da senha:");
        TextField campoTamanhoSenha = new TextField();
        campoTamanhoSenha.setText("8"); // Sugestão de tamanho de senha
        campoTamanhoSenha.setStyle("-fx-text-fill: cyan; -fx-background-color: black;");
        
        Label labelSenhaGerada = new Label("Senha gerada:");
        TextField campoSenhaGerada = new TextField();
        campoSenhaGerada.setEditable(false);
        campoSenhaGerada.setStyle("-fx-text-fill: cyan; -fx-background-color: black;");

        Button botaoGerar = new Button("Gerar Senha");
        botaoGerar.setOnAction(e -> {
            int tamanhoSenha = Integer.parseInt(campoTamanhoSenha.getText()); // Pega o tamanho desejado
            String senha = GeradorSenha.gerarSenha(tamanhoSenha); // Gera a senha
            campoSenhaGerada.setText(senha); // Apresenta a senha gerada
        });

        VBox vbox = new VBox(labelTamanhoSenha, campoTamanhoSenha, botaoGerar, labelSenhaGerada, campoSenhaGerada);
        vbox.setSpacing(10); // Configura o espaçamento entre os componentes
        vbox.setPadding(new Insets(10)); // Adiciona um espaçamento de 10 pixels em todas as bordas

        Scene cena = new Scene(vbox, 300, 200);

        janela.setScene(cena);
        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}