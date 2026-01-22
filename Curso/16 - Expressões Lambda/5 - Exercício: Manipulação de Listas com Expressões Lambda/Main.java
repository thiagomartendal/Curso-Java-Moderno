import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
            List<String> minhaLista = new ArrayList<>();
            minhaLista.add("maça");
            minhaLista.add("banana");
            minhaLista.add("cereja");
            minhaLista.add("abacaxi");

            minhaLista.removeIf(str -> str.length() > 5);

            minhaLista.add(0, "uva");

            minhaLista.forEach(System.out::println); // Inferiu que as strings presentes na lista devem ser impressas
    }
    
}
