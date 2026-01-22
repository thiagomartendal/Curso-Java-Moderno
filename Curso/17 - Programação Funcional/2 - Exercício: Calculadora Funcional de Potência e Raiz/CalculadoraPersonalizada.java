public class CalculadoraPersonalizada {
    
    public static void main(String[] args) {
        OperacaoMatematica potencia = (a, b) -> Math.pow(a, b);
        OperacaoMatematica raiz = (a, b) -> Math.sqrt(a + b);

        System.out.println("Potência: " + potencia.executar(4, 5));
        System.out.println("Raíz Quadrada: " + raiz.executar(4, 5));
    }

}