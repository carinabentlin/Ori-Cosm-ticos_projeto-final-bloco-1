package OriCosmeticos.model;

// Classe abstrata: não pode ser instanciada diretamente,
// serve de base para os outros produtos (Creme, Sabonete)
public abstract class Produto {
    // Atributos comuns a todos os produtos
    private int id;
    private String nome;
    private int categoria;   // 1 - Creme | 2 - Sabonete
    private float preco;

    // Construtor: inicializa os atributos quando um produto é criado
    public Produto(int id, String nome, int categoria, float preco) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    // Getters e Setters: permitem acessar e alterar os atributos
    public int getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getCategoria() { return categoria; }
    public void setCategoria(int categoria) { this.categoria = categoria; }
    public float getPreco() { return preco; }
    public void setPreco(float preco) { this.preco = preco; }

    // Método comum para mostrar os dados do produto
    // Pode ser sobrescrito (polimorfismo) nas subclasses
    public void visualizar() {
        System.out.printf("ID: %d | Nome: %s | Categoria: %d | Preço: R$ %.2f%n",
                id, nome, categoria, preco);
    }
}
