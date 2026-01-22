// Java não permite mais de uma classe com modificador de acesso public no mesmo arquivo

class Contador {
    static int contagem = 0; // Atributos estáticos tem seu valor unificado para todas as instâncias da classe

    public Contador() {
        contagem++;
    }
}

public class TesteContador {

    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        System.out.println("Número de objetos criados: " + Contador.contagem);
    }

}