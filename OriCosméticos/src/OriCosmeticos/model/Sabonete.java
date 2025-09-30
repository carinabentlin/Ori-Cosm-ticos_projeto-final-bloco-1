package OriCosmeticos.model;

// Classe Sabonete herda de Produto
// Ela representa um tipo específico de produto
public class Sabonete extends Produto {

    // Atributo exclusivo do Sabonete
    private String fragrancia;

    // Construtor: chama o construtor da classe Produto (super)
    // e adiciona a fragrância
    public Sabonete(int id, String nome, int categoria, float preco, String fragrancia) {
        super(id, nome, categoria, preco); // inicializa os atributos da classe mãe
        this.fragrancia = fragrancia;
    }

    // Getter e Setter para fragrância
    public String getFragrancia() { return fragrancia; }
    public void setFragrancia(String fragrancia) { this.fragrancia = fragrancia; }

    // Sobrescreve o método visualizar da classe Produto
    // Mostra também a fragrância além dos dados básicos
    @Override
    public void visualizar() {
        super.visualizar(); // chama o visualizar da classe Produto
        System.out.println("Fragrância: " + fragrancia);
    }
}
