public class Main {

    public static void main(String[] args) {
        // Exemplos de Identificadores Válidos
        var nome = "Pessoa";
        var idade = 10;
        var salarioAnual = 1950.25;
        // Aceitável mas evitar:
        var _temp = false;
        var $id = 1;
        var var = true;

        System.err.println(nome + " - " + idade + " - " + salarioAnual + " - " + _temp + " - " + $id  + " - " + var);

        // Exemplos de Identificadores Inválidos
        // 123abc // começa com um dígito
        // a-b // contém um caractere inválido, -
        // class // é uma palavra reservada
    }

}
