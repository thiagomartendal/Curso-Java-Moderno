package com.produtoapi.repository;

import com.produtoapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Busca por nome
    List<Produto> findByNome(String nome);

    // Busca por dados que contenham o nome como substring
    List<Produto> findByNomeContaining(String nome);
    
    // Busca por nome e por status específicos
    List<Produto> findByNomeAndStatus(String nome, String status);
    
    // Busca por um nome que começa com um prefixo específico como substring
    List<Produto> findByNomeStartingWith(String prefix);
    
    // Busca por um nome que termina com um sufixo específico como substring
    List<Produto> findByNomeEndingWith(String suffix);

    // Busca por preço
    List<Produto> findByPreco(Double preco);

    // Busca por dados com um preço maior que o preço fornecido
    List<Produto> findByPrecoGreaterThan(Double preco);

    // Busca por dados com um preço menor que o preço fornecido
    List<Produto> findByPrecoLessThan(Double preco);

    // Usando anottation @Query para obter total de preços
    @Query("SELECT SUM(p.preco) FROM Produto p")
    Double findTotalPreco();

    // Buscas por quantidade de produto
    List<Produto> findByQuantidade(Integer quantidade);

    // Buscas por quantidade de produto menores que uma quantidade específica
    List<Produto> findByQuantidadeLessThan(Integer quantidade);

    // Buscas por quantidade de produto maiores que uma quantidade específica
    List<Produto> findByQuantidadeGreaterThan(Integer quantidade);

    // Busca produtos por status
    List<Produto> findByStatus(String status);

    // Busca por produtos sem status (o status é nulo)
    List<Produto> findByStatusIsNull();

    // Busca produtos por preço e status
    List<Produto> findByPrecoAndStatus(Double preco, String status);
}
