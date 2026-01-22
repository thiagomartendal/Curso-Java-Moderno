import java.util.Set;
import java.util.HashSet;

public class ExemploSet {
    
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        // Set não permite repetição de elementos

        // Adicionando elementos
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("C++");

        // Verificando se o conjunto contém o elemento
        System.out.println("Contém 'Java'? " + conjunto.contains("Java"));

        // Adicionando mais elementos
        conjunto.add("Javascript");
        conjunto.add("Ruby");

        // Imprime o conjunto
        System.out.println("Conjunto completo: " + conjunto);

        // Removendo um elemento
        conjunto.remove("Python");

        // Imprime o conjunto
        System.out.println("Conjunto completo: " + conjunto);

        // Tentando adicionar elemento duplicado
        boolean foiAdicionado = conjunto.add("Java");
        System.out.println("Java foi adiconado novamente? " + foiAdicionado);

        // Limpando o conjunto
        conjunto.clear();
        System.out.println("Conjunto após limpar: " + conjunto);
    }

}