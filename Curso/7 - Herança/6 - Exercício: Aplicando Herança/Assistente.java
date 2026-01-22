class Assistente extends Funcionario {
    Assistente(String nome, double salario) {
        super(nome, salario);
    }

    public double ganhoAnual() {
        return super.ganhoAnual() + 1000.00;
    }
}