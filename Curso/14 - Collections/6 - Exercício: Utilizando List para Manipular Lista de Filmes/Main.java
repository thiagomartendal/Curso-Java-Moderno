import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<String> filmes = new ArrayList<>();

        filmes.add("Sangue Negro");
        filmes.add("Onde os Fracos Não Tem Vez");
        filmes.add("Tron: O Legado");
        filmes.add("Uma Batalha Após a Outra");

        System.out.println("Tron: O Legado está na lista de filmes? " + (filmes.contains("Tron: O Legado") ? "Sim" : "Não"));

        for (var filme: filmes)
            System.out.println(filme);
    }
    
}