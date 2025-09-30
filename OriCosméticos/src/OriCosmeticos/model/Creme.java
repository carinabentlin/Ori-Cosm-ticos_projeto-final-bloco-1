package OriCosmeticos.model;

// Classe Creme herda de Produto
// Representa um tipo específico de produto (creme)
public class Creme extends Produto {

    // Atributo exclusivo do Creme
    private String tipoPele;

    // Construtor: chama o construtor da classe Produto (super)
    // e adiciona o tipo de pele
    public Creme(int id, String nome, int categoria, float preco, String tipoPele) {
        super(id, nome, categoria, preco); // inicializa os atributos herdados de Produto
        this.tipoPele = tipoPele;
    }

    // Getter e Setter para tipoPele
    public String getTipoPele() { return tipoPele; }
    public void setTipoPele(String tipoPele) { this.tipoPele = tipoPele; }

    // Sobrescreve o método visualizar da classe Produto
    // Mostra também o tipo de pele além dos dados básicos
    @Override
    public void visualizar() {
        super.visualizar(); // chama o visualizar da classe Produto
        System.out.println("Tipo de Pele: " + tipoPele);
    }
}
