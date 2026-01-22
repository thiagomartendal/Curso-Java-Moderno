public class Funcionario {
    String nome;
    String cargo;
    int idade;
    
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Funcionário 1";
        funcionario1.cargo = "Cargo 1";
        funcionario1.idade = 30;

        Funcionario funcionario2 = new Funcionario();

        funcionario2.nome = "Funcionário 2";
        funcionario2.cargo = "Cargo 2";
        funcionario2.idade = 50;

        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Idade: " + funcionario1.idade);

        System.out.println("------------------------");

        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Cargo: " + funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade);
    }
}
