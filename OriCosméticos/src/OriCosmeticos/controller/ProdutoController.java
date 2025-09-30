package OriCosmeticos.controller;

import java.util.ArrayList;
import OriCosmeticos.model.Produto;
import OriCosmeticos.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    private int id = 0;

    // Gera um novo ID automaticamente
    public int gerarId() {
        return ++id;
    }

    // LISTAR produtos usando lambda
    // forEach percorre a lista e mostra cada produto
    @Override
    public void listarTodas() {
        listaProdutos.forEach(Produto::visualizar); 
    }

    // CADASTRAR novo produto
    @Override
    public void cadastrar(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("\nProduto cadastrado com sucesso!");
    }

    // ATUALIZAR um produto pelo ID usando stream + lambda
    // stream percorre a lista e procura pelo ID
    @Override
    public void atualizar(Produto produto) {
        listaProdutos.stream()
            .filter(p -> p.getId() == produto.getId()) // procura o produto com esse ID
            .findFirst() // pega o primeiro que achar
            .ifPresentOrElse(
                p -> { // se encontrar
                    listaProdutos.set(listaProdutos.indexOf(p), produto); 
                    System.out.println("\nProduto atualizado com sucesso!");
                },
                () -> System.out.println("\nProduto não encontrado!") // se não encontrar
            );
    }

    // PROCURAR produto por ID com stream
    @Override
    public void procurarPorId(int id) {
        listaProdutos.stream()
            .filter(p -> p.getId() == id) // procura o produto
            .findFirst()
            .ifPresentOrElse(
                Produto::visualizar, // se achar, mostra o produto
                () -> System.out.println("\nProduto não encontrado!") // senão, avisa
            );
    }

    // DELETAR produto usando removeIf
    // removeIf percorre a lista e apaga o produto com esse ID
    @Override
    public void deletar(int id) {
        boolean removido = listaProdutos.removeIf(p -> p.getId() == id);
        if (removido) {
            System.out.println("\nProduto deletado com sucesso!");
        } else {
            System.out.println("\nProduto não encontrado!");
        }
    }

    // Buscar produto auxiliar (usado em outras partes do código)
    public Produto buscarNaCollection(int id) {
        return listaProdutos.stream()
            .filter(p -> p.getId() == id) // procura produto
            .findFirst()
            .orElse(null); // retorna o produto ou null
    }
}
