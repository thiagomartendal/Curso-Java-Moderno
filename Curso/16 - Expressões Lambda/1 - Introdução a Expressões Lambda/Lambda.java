import java.util.Arrays;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5);

        // for (Integer numero: listaDeNumeros)
        //     System.out.println(numero);

        // Expressões Lambda
        // listaDeNumeros.forEach((Integer numero) -> System.out.println(numero));
        listaDeNumeros.forEach((numero) -> System.out.println(numero)); // Inferência de tipo automática
    }
    
}