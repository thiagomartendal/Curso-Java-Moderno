package empresa.dados;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double aumento) {
        salario += aumento;
    }

    /*
        O nome e a lista de parâmetros indicam a sobrecarga de métodos.
        Métodos com o mesmo nome mas com listas de parâmetros diferentes se sobrecarregam.
    */

    // O método aumentarSalario é sobrecarregado
    public void aumentarSalario(int porcentagem) {
        salario += salario * porcentagem / 100.0;
    }

    public void alterarQualquerSalario(Funcionario func, double novoSalario){
        func.salario = novoSalario;
    }

    public String obterInfo() {
        return "Nome: " + nome + ", Salario: " + salario;
    }
}
