public class Funcionario {
    String nome;
    String cargo;
    int idade;

    // A definição de dois ou mais construtores com diferentes listas de parâmetros configura a sobrecarga dos construtores

    Funcionario() {
        
    }

    Funcionario(String nome) {
        this.nome = nome;
    }

    Funcionario(String nome, String cargo, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    Funcionario(int idade, String nome, String cargo) { // Difere do construtor anterior pela posição dos parâmetros
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Funcionário 1";
        funcionario1.cargo = "Cargo 1";
        funcionario1.idade = 30;

        Funcionario funcionario2 = new Funcionario("Funcionário 2");

        Funcionario funcionario3 = new Funcionario(40, "Funcionário 3", "Cargo 3");

        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Idade: " + funcionario1.idade);

        System.out.println("------------------------");

        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Cargo: " + funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade);

        System.out.println("------------------------");

        System.out.println("Nome: " + funcionario3.nome);
        System.out.println("Cargo: " + funcionario3.cargo);
        System.out.println("Idade: " + funcionario3.idade);
    }
}
