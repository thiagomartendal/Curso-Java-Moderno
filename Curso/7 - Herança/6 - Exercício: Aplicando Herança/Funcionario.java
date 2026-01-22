class Funcionario {
    private String nome;
    private double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void addAumento(double valor) {
        salario += valor;
    }

    public String getNome() {
        return nome;
    }

    public double ganhoAnual() {
        return salario * 12.0;
    }
}