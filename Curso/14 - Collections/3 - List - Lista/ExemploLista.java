import java.util.Arrays; // Importação explícita
import java.util.List;
import java.util.ArrayList;
// import java.util.*; // Importa todas as classes de java.util

public class ExemploLista {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        // Verificando se a lista contém um elemento
        System.out.println("Contém Java? " + lista.contains("Java")); // Retorna verdadeiro

        // Adicionando elementos de outra coleção
        List<String> outraLista = Arrays.asList("Javascript", "Ruby");
        lista.addAll(outraLista);
        System.out.println(lista);

        // Removendo um elemento
        lista.remove("Python");
        System.out.println("Lista após removção: " + lista);

        // Obtendo um elemento pelo índice
        String e = lista.get(2); //Obtém o 3º elemento da lista
        System.out.println("Elemento do índice 2: " + e);

        // Limpando a lista
        lista.clear();
        System.out.println("Lista após a limpeza: " + lista);
    }
    
}