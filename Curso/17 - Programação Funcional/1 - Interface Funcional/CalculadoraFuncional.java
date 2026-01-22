@FunctionalInterface
interface Calculadora {
    double calcular(double a, double b);
}

public class CalculadoraFuncional {
    
    public static void main(String[] args) {
        Calculadora adicao = (a, b) -> a + b;
        Calculadora subtracao = (a, b) -> a - b;
        Calculadora multiplicacao = (a, b) -> a * b;
        Calculadora divisao = (a, b) -> a / b;

        System.out.println("Adição: " + adicao.calcular(10, 5));
        System.out.println("Subtração: " + subtracao.calcular(10, 5));
        System.out.println("Multiplicação: " + multiplicacao.calcular(10, 5));
        System.out.println("Divisão: " + divisao.calcular(10, 5));
    }

}