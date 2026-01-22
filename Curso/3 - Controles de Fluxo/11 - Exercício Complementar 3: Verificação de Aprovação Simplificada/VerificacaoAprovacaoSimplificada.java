public class VerificacaoAprovacaoSimplificada {

    public static void main(String[] args) {
        int nota1 = 8, nota2 = 9;
        double media = (nota1 + nota2) / 2.0;

        String resultado = (media >= 6.0) ? "Aprovado" : "Reprovado";

        System.out.println("O aluno foi: " + resultado + " com média " + media);
    }

}
