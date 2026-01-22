public class Calculadora {

    public static void main(String[] args) {
        Operacao add = new Adicao();
        Operacao sub = new Subtracao();
        Operacao mul = new Multiplicacao();
        Operacao div = new Divisao();

        double r1 = add.calcular(5, 6);
        double r2 = sub.calcular(14, 9);
        double r3 = mul.calcular(7, 7);
        double r4 = div.calcular(144, 2);

        System.out.println(r1 + " - " + r2 + " - " + r3 + " - " + r4);
    }

}