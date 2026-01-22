import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class ExemploLista extends Application {
    
    @Override
    public void start(Stage janela) {
        ObservableList<String> itens;
        itens = FXCollections.observableArrayList("Item 1", "Item 2", "Item 3");

        ListView<String> listView = new ListView<>(itens);

        VBox layout = new VBox(listView);

        Scene cena = new Scene(layout, 300, 200);

        janela.setScene(cena);
        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
