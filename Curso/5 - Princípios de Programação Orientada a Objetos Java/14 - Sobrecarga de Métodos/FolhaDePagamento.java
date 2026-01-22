import empresa.dados.Funcionario;

public class FolhaDePagamento {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Funcionário", 6200.00);
        funcionario.aumentarSalario(100); // Chama o segundo método

        System.out.println(funcionario.obterInfo());

        funcionario.aumentarSalario(100d); // Chama o primeiro método
        System.out.println(funcionario.obterInfo());
    }
    
}
