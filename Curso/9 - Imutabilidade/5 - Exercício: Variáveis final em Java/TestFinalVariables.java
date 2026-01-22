class FinalVariables {
    final int numeroMaximo = 100;
    final String mensagem = "Bem-vindo ao mundo da programação!";

    public void imprimirValoresFinais() {
        System.out.println(numeroMaximo + " - " + mensagem);
    }
}

public class TestFinalVariables {
    public static void main(String[] args) {
        FinalVariables finalVal = new FinalVariables();
        
        // Erro: Não é possível alterar valores final
        // finalVal.numeroMaximo = 50;
        // finalVal.mensagem = "Bem-Vindo";

        finalVal.imprimirValoresFinais();
    }
}