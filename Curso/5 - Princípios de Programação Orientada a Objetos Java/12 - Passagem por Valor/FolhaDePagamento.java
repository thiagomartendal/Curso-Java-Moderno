import empresa.dados.Funcionario;

public class FolhaDePagamento {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Funcionário", 6200.00);
        System.out.println(funcionario.obterInfo());

        funcionario.aumentarSalario(3000.00);
        System.out.println(funcionario.obterInfo());
    }
    
}
