public class VerificacaoAprovacaoPresenca {

    public static void main(String[] args) {
        int nota1 = 8, nota2 = 9, frequencia = 66;
        double media = (nota1 + nota2) / 2.0;

        String resultado;
        if ((media >= 7.0) && (frequencia >= 75)) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }

        System.out.println("O aluno foi: " + resultado + " com média " + media + " e fequência " + frequencia + "%");
    }

}
