public class PromocaoAutomatica {

    public static void main(String[] args) {
        byte a = 15;
        short b = 126;
        char c = 'c';
        int d = 1415;
        long e = 1234567890L;
        float f = 1.45f;
        double g = 14.56;
        System.out.println(a + " - " + b + " - " + c + " - " + d + " - " + e + " - " + f + " - " + g);

        b = a;
        System.out.println(b);

        e = d;
        System.out.println(e);

        g = f;
        System.out.println(g);

        b = 126;
        int soma1 = a + b;
        System.out.println(a + " + " + b + " = " + soma1);

        e = 1234567890L;
        long soma2 = d + e;
        System.out.println(d + " + " + e + " = " + soma2);
    }

}
