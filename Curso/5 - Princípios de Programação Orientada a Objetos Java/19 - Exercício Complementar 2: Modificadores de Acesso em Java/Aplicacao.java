public class Aplicacao {
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Pessoa 1";
        pessoa.setIdade(30);
        pessoa.setEndereco("Rua 1");
        pessoa.setTelefone(12345678);

        System.out.println(pessoa.nome + " - " + pessoa.getIdade() + " - " + pessoa.getEndereco() + " - " + pessoa.getTelefone());
    }

}
