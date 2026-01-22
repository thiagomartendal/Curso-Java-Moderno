import empresa.dados.Funcionario;

public class FolhaDePagamento {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Funcionário", 6200.00);
        funcionario.nome = "Funcionário 1";
        // funcionario.salario = 0.00; // salario não é atributo público, por isso não é acessado fora do pacote
        System.out.println(funcionario.nome);
    }
    
}
