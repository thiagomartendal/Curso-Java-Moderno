public class Main {
    
    public static void main(String[] args) {
        int a = 10;

        a++; // Equivalente à a = a + 1;
        System.out.println(a); // Saída: 11

        a--; // Equivalente à a = a - 1;
        System.out.println(a); // Saída: 10

        // Pós-decremento:
        int b = a--; // a é 9, mas b é 10 (porque o valor antigo de a foi usado) - Primeiro atribui o valor a b, depois decrementa a
        System.out.println("Pós-decremento:");
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);

        // Pré-decremento:
        b = --a; // a é 8, e b também é 8
        System.out.println("Pré-decremento:");
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);

        // Pré-incremento:
        b = ++a; // a é 9, e b também é 9
        System.out.println("Pré-incremento:");
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);

        // Pós-incremento:
        b = a++; // a é 10, e b é 9 (porque o valor antigo de a foi usado) - Primeiro atribui o valor a b, depois incrementa a
        System.out.println("Pós-incremento:");
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
    }

}

/*
    Incremento (++)
    Decremento (--)
    Positivo (+)
    Negativo (-)
    Negação lógica (!)
*/