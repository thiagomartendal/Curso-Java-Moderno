import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        numeros.removeIf(numero -> numero % 2 == 0);

        System.out.println("Números ímpares: " + numeros);
    }

}