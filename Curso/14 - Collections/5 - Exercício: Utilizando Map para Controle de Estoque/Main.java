import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> produtos = new HashMap<>();

        produtos.put("Banana1", 20);
        produtos.put("Laranja2", 45);
        produtos.put("Uva3", 14);
        produtos.put("Maçã4", 38);
        produtos.put("Pêra5", 50);

        System.out.println("Quantidade total de Banana1: " + produtos.get("Banana1"));

        int quantidadeUva = produtos.get("Uva3");
        int quantidadeRemovida = 10;
        if (quantidadeUva >= quantidadeRemovida)
            produtos.put("Uva3", quantidadeUva - quantidadeRemovida);
        else
            System.out.println("O produto tem uma quantidade insuficiente para remoção.");

        for (var entrada: produtos.entrySet()) // entrada => Map.Entry<String, Integer>
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
    }
    
}