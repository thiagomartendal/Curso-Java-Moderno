import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 100);
        List<Integer> numerosPares = new ArrayList<>();

        // As chaves são opcionais caso o copo da expressão lambda tenha apenas uma instrução
        // (int x, int y) -> x + y;

        // Expressões lambda acessam apenas variáveis final do escopo local
        final int i = 10;
        // Caso i não seja marcado como final, o compilador acaba considerando como efetivamente final caso i não seja modificado
        // i++; // Como i é modificada aqui, o compilador não considera mais i como final
 
        listaDeNumeros.forEach(numero -> { // Parêntesis são opcionais caso não se use tipos expĺícitos, no caso (Integer numero)
            int y = 200;
            y++;
            System.out.println("Valor de i: " + i + " - Valor de y: " + y);
            if (numero % 2 == 0)
                numerosPares.add(numero);
        });

        System.out.println("Números pares: " + numerosPares);
    }
    
}