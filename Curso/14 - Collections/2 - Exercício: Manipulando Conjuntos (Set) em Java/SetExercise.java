import java.util.*;

public class SetExercise {

    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println(numeros);

        System.out.println("Contém o número 4? " + numeros.contains(4));

        numeros.remove(2);

        System.out.println(numeros);
    }

}