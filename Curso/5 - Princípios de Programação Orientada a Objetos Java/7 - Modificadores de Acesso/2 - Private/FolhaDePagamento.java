import empresa.dados.Funcionario;

public class FolhaDePagamento {

    public static void main(String[] args) {
        // Funcionario funcionario = new Funcionario("Funcionário", 6200.00); // Este construtor não é mais acessível, pois é privado
        
        // nome é atributo privado, por isso não é acessado fora do pacote
        // funcionario.nome = "Funcionário 1";
        // System.out.println(funcionario.nome);

        Funcionario funcionario = new Funcionario();
    }
    
}
