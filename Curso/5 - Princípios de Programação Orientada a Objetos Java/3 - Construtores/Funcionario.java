public class Funcionario {
    String nome;
    String cargo;
    int idade;
    
    // Este é o construtor
    Funcionario(String nome, String cargo, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Funcionário 1", "Cargo 1", 30);
        Funcionario funcionario2 = new Funcionario("Funcionário 2", "Cargo 2", 50);

        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Idade: " + funcionario1.idade);

        System.out.println("------------------------");

        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Cargo: " + funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade);
    }
}
