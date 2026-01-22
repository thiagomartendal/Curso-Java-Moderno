public class Aplicacao {

    private static void print(Livro livro) {
        System.out.println(livro.titulo + " - " + livro.getAutor() + " - " + livro.anoPublicacao + " - " + livro.preco);
        // Variáveis protected e default (package private) são acessíveis dentro do mesmo pacote
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Livro 2", "Autor 2");
        Livro livro3 = new Livro("Livro 3", "Autor 3", 2000, 54.95);

        print(livro1);
        print(livro2);
        print(livro3);
    }

}
