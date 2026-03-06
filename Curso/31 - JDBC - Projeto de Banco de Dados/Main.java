import java.sql.Connection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try (Connection conexao = ConexaoDB.conectar()) {
            ProdutoDAO produtoDao = new ProdutoDAO(conexao);

            // Lista todos os produtos (deve estar vazio neste ponto)
            mostarProdutos(produtoDao);

            // Cria os produtos
            criarProdutos(produtoDao);

            // Realiza uma consulta
            consultaPorId(produtoDao);

            // Excluir por ID
            produtoDao.excluir(3);
            
            // Excluir todos
            produtoDao.excluirTodos();
            
            // Lista todos os produtos após a inserção
            mostarProdutos(produtoDao);
        } catch(Exception e) {
            System.err.println("Erro geral: " + e.getMessage());
        }
    }

    private static void criarProdutos(ProdutoDAO produtoDao) {
        // Exemplo de inserção de produtos
        Produto novoProduto1 = new Produto("Nootebook", 10, 1999.99, "Em Estoque");
        Produto novoProduto2 = new Produto("Smartphone", 20, 1499.99, "Estoque Baixo");
        Produto novoProduto3 = new Produto("Tablet", 15, 799.99, "Estoque Baixo");

        produtoDao.inserir(novoProduto1);
        produtoDao.inserir(novoProduto2);
        produtoDao.inserir(novoProduto3);
    }

    private static void consultaPorId(ProdutoDAO produtoDao) {
        // Exemplo de consulta por ID
        Produto produtoConsultado = produtoDao.consultarPorId(1);
        if (produtoConsultado != null) {
            produtoConsultado.setNome("Laptop");
            System.out.println("Produto encontrado: " + produtoConsultado.getNome());
            produtoDao.atualizar(produtoConsultado);
        } else
            System.out.println("Produto não encontrado.");
    }

    // Método para listar os produtos
    private static void mostarProdutos(ProdutoDAO produtoDAO) {
        List<Produto> todosProdutos = produtoDAO.listarTodos();

        if (todosProdutos.isEmpty())
            System.out.println("Nenhum produto encontrado.");
        else {
            System.out.println("Lista de Produtos");
            for (Produto p: todosProdutos)
                System.out.println(p.getId() + ": " + p.getNome() + " - R$" + p.getPreco()); 
        }
    }
    
}
