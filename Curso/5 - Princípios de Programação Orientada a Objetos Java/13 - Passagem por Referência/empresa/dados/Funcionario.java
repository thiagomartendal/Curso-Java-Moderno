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
    }

    // Objetos são automaticamente passados por referência
    public void alterarQualquerSalario(Funcionario func, double novoSalario){
        func.salario = novoSalario;
    }

    public String obterInfo() {
        return "Nome: " + nome + ", Salario: " + salario;
    }
}
