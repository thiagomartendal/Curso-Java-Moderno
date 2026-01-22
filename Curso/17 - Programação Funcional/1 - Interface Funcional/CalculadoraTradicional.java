public class CalculadoraTradicional {
    public double adicionar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        CalculadoraTradicional calculadora = new CalculadoraTradicional();

        double resultadoAdicao = calculadora.adicionar(10, 5);

        System.out.println(resultadoAdicao);

        double resultadoSubtracao = calculadora.subtrair(10, 5);

        System.out.println(resultadoSubtracao);

        double resultadoMultiplicacao = calculadora.multiplicar(10, 5);

        System.out.println(resultadoMultiplicacao);

        double resultadoDivisao = calculadora.dividir(10, 5);

        System.out.println(resultadoDivisao);
    }
}
