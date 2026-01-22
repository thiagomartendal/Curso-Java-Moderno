public class TesteHeranca {

    public static void main(String[] args) {
        Assistente assistente = new Assistente("Assistente 1", 3000.00);
        assistente.addAumento(500.00);

        System.out.println("Salário anual de " + assistente.getNome() + ": R$" + assistente.ganhoAnual());
    }

}