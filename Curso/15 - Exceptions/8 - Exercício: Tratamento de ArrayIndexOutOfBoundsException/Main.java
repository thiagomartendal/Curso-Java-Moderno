public class Main {

    public static void main(String[] args) {
        int[] meuArray = {10, 20, 30, 40, 50};
        ArrayExercicio arrayEx = new ArrayExercicio();

        // Teste com índices válidos
        System.out.println("Elemento no índice 2: " + arrayEx.acessarElemento(meuArray, 2));

        // Teste com índice inválido
        System.out.println("Elemento no índice 10: " + arrayEx.acessarElemento(meuArray, 10));
    }
    
}
