public class Main {

    public static void main(String[] args) {
        byte a1 = 10;
        int b1 = a1 + 5; // a1 é promovido para int antes do cálculo
        System.out.println(b1);

        int a2 = 10;
        long b2 = 15L;
        long c2 = a2 + b2; // a2 é promovido para long antes do cálculo
        System.out.println(c2);

        int a3 = 10;
        float b3 = 1.5f;
        float c3 = a3 * b3; // a3 é promovido para float antes do cálculo
        System.out.println(c3);

        int a4 = 10;
        double b4 = 1.5;
        double c4 = a4 * b4; // a4 é promovido para double antes do cálculo
        System.out.println(c4);
    }

}

// A promoção automática converte tipos menores para tipos maiores, quano necessário, para garantir a precisão de calculos