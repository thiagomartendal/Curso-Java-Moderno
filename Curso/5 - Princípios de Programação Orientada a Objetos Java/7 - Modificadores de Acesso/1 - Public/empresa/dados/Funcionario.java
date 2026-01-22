package empresa.dados;

public class Funcionario { // Sem o public a classe não pode ser importada fora do pacote
    public String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
    }
}
