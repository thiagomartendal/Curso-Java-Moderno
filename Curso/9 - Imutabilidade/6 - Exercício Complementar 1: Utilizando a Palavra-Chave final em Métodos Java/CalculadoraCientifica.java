class CalculadoraCientifica extends Calculadora {
    // Erro: Não é possível sobreescrever métodos final
    public final int somar(int a, int b) {
        return a + b;
    }
}
