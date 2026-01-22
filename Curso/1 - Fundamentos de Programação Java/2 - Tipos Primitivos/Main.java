/*
    1. byte: 8 bits --> -128 a 127.
    2. short: 16 bits --> -32768 a 32767.
    3. int: 32 bits --> -2147483648 a 2147483647.
    4. long: 64 bits --> -9223372036854775808 a 9223372036854775807.
    5. float: 32 bits --> ponto flutuante de aproximadamente ±1.4E-45 a ±3.4028235E38.
    6. double: 64 bits --> ponto flutuante de aproximadamente ±4.9E-324 a ±1.7976931348623157E308.
    7. boolean: true ou false.
    8. char: 16 bits --> caracteres únicos, como 'a' ou 'A'. (65535).
*/

public class Main {

    public static void main(String[] args) {
        byte idade = 25;
        short ano = 2024;
        int populacaoCidade = 500000;
        long populacaoMundial = 7800000000L;
        float altura = 1.75f;
        double salario = 4500.50;
        boolean estudante = true;
        char inicialNome = 'A';
        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("População da cidade: " +
        populacaoCidade);
        System.out.println("População mundial: " + populacaoMundial);
        System.out.println("Altura: " + altura);
        System.out.println("Salário: " + salario);
        System.out.println("É estudante? " + estudante);
        System.out.println("Inicial do nome: " + inicialNome);
    }

}
