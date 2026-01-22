public class Satisfacao {

    public static void main(String[] args) {
        int nivel = 3;

        String satisfacao;
        switch (nivel) {
            case 1 -> satisfacao = "Muito insatisfeito";
            case 2 -> satisfacao = "Insatisfeito";
            case 3 -> satisfacao = "Neutro";
            case 4 -> satisfacao = "Satisfeito";
            case 5 -> satisfacao = "Muito satisfeito";
            default -> satisfacao = "Opção inválida (deve estar entre 1 e 5)";
        };

        System.out.println(satisfacao);
    }
    
}
