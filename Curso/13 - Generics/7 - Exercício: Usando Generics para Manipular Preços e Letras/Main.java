public class Main {

    public static void main(String[] args) {
        Caixa<Double> precos = new Caixa<>(10);
        Caixa<Character> letras = new Caixa<>(10);

        precos.adicionar(2.50, 0);
        precos.adicionar(3.25, 1);
        precos.adicionar(4.77, 2);
        precos.adicionar(6.00, 3);
        precos.adicionar(5.41, 4);
        precos.adicionar(9.28, 5);
        precos.adicionar(10.00, 6);
        precos.adicionar(7.77, 7);
        precos.adicionar(8.88, 8);
        precos.adicionar(1.99, 9);

        letras.adicionar('a', 0);
        letras.adicionar('b', 1);
        letras.adicionar('c', 2);
        letras.adicionar('d', 3);
        letras.adicionar('e', 4);
        letras.adicionar('f', 5);
        letras.adicionar('g', 6);
        letras.adicionar('h', 7);
        letras.adicionar('i', 8);
        letras.adicionar('j', 9);

        for (int i = 0; i < 10; i++)
            System.out.println(letras.obter(i) + " - " + precos.obter(i));
    }

}
