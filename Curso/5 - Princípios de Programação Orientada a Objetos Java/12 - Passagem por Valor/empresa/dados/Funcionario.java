package empresa.dados;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Tipos primitivos são automaticamente passados por valor
    public void aumentarSalario(double aumento) {
        salario += aumento;
        // aumento += 1000; // Não afeta salario 
    }

    public String obterInfo() {
        return "Nome: " + nome + ", Salario: " + salario;
    }
}
