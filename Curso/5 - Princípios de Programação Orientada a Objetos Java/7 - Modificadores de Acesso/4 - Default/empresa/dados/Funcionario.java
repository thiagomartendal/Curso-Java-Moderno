package empresa.dados;

public class Funcionario { // Sem o public a classe não pode ser importada fora do pacote
    private String nome;
    double salario;

    private Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
    }

    Funcionario() { // Construtor sem modificador de acesso é classificado como default, e pode ser acessado apenas dentro do pacote
        Funcionario funcionario = new Funcionario("Funcionário", 5000.00);
    }
}
