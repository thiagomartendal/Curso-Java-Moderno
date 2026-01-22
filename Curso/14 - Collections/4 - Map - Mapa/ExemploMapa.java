import java.util.HashMap;
import java.util.Map;

// HashMap não mantem uma ordenação
// Para usar mapas ordenados, existem os conteineres LinkedHashMap e TreeMap

public class ExemploMapa {
    
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        // Adicionando elementos
        mapa.put("Java", 20);
        mapa.put("Python", 10);
        mapa.put("C++", 15);

        // Verificando se o mapa contém uma chave
        System.out.println("Contém Java? " + mapa.containsKey("Java"));

        // Obtendo o valor associado a uma chave
        System.out.println("Valor associado a Java: " + mapa.get("Java"));

        mapa.put("Javascript", 25);
        mapa.put("Ruby", 5);

        // Imprime sem ordem
        System.out.println(mapa);

        // Removendo um elemento
        mapa.remove("Python");
        System.out.println("Mapa após remoção: " + mapa);

        // Atualizando um valor de uma chave
        mapa.put("Java", 30);
        System.out.println("Mapa após atualização: " + mapa);

        // Limpando mapa
        mapa.clear();
        System.out.println("Mapa após limpeza: " + mapa);
    }

}