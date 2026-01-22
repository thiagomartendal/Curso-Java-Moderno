public class Funcionario {
    String nome;
    String cargo;
    int idade;

    // Construtor explícito
    Funcionario() {
        // O construtor padrão também é vazio, mas adicionado pelo compilador
    }

    Funcionario(String nome, String cargo, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    public static void main(String[] args) {
        // Funcionario funcionario1 = new Funcionario("Funcionário 1", "Cargo 1", 30);
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Funcionário 1";
        funcionario1.cargo = "Cargo 1";
        funcionario1.idade = 30;

        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Idade: " + funcionario1.idade);
    }
}
