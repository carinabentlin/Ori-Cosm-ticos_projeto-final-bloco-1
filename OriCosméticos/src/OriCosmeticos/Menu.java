package OriCosmeticos;

//Importa classes utilitárias e do projeto
import java.util.Scanner;  // Para ler entradas do usuário
import OriCosmeticos.controller.ProdutoController;  // Controller que gerencia os produtos
import OriCosmeticos.model.Creme;
import OriCosmeticos.model.Sabonete;
import OriCosmeticos.model.Produto;
import OriCosmeticos.util.Cores; // Classe com códigos de cores para estilizar o menu

public class Menu {

    private static final Scanner leia = new Scanner(System.in);     // Scanner para capturar entradas via teclado
    private static final ProdutoController produtoController = new ProdutoController();     // Controller responsável pelo CRUD dos produtos

    public static void main(String[] args) {

        criarProdutosTeste(); // Cria produtos iniciais (exemplo para testar)

        int opcao; // Variável que guarda a escolha do usuário

        while (true) {         // Loop infinito para manter o menu ativo até o usuário escolher sair

            // Exibição do menu com cores

            System.out.println(Cores.TEXT_GREEN_BOLD
                    + "=====================================================");
            System.out.println("           ORI COSMÉTICOS naturais           ");
            System.out.println("=====================================================" + Cores.RESET);
            System.out.println(Cores.TEXT_CYAN_BRIGHT + " 1 - Criar Produto");
            System.out.println(" 2 - Listar Produtos");
            System.out.println(" 3 - Buscar Produto por ID");
            System.out.println(" 4 - Atualizar Produto");
            System.out.println(" 5 - Deletar Produto");
            System.out.println(" 0 - Sair" + Cores.RESET);
            System.out.println(Cores.TEXT_GREEN_BOLD
                    + "=====================================================" + Cores.RESET);
            System.out.print("Escolha uma opção: ");

            opcao = leia.nextInt();  // Lê a opção escolhida
 
            leia.nextLine();
            
            // Se opção for 0, encerra o programa
            if (opcao == 0) {
                System.out.println(Cores.TEXT_PURPLE_BOLD + "\nOri BioCosméticos - natureza que nutre a pele" + Cores.RESET);
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {    // Switch chama o método correspondente

                case 1 -> cadastrarProduto();
                case 2 -> produtoController.listarTodas();
                case 3 -> procurarProdutoPorId();
                case 4 -> atualizarProduto();
                case 5 -> deletarProduto();
                default -> System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.RESET);
            }

            keyPress();// Pausa até usuário pressionar Enter
        }
        
    }

    public static void sobre() {     // Informações sobre o projeto

        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Carina Bentlin");
        System.out.println("Generation Brasil - carinabentlin@gmail.com");
        System.out.println("github.com/carinabentlin");
        System.out.println("*********************************************************");
    }

    public static void keyPress() {    // Pausa execução até pressionar Enter

        System.out.println(Cores.RESET + "\n\nPressione Enter para continuar...");
        leia.nextLine();
    }

    private static void criarProdutosTeste() {
        produtoController.cadastrar(new Creme(produtoController.gerarId(),
                "Creme Facial Nutritivo", 1, 59.90f, "Pele Seca"));
        produtoController.cadastrar(new Sabonete(produtoController.gerarId(),
                "Sabonete de Lavanda", 2, 12.50f, "Lavanda"));
    }

    private static void cadastrarProduto() {     // Cria produtos de exemplo para teste

        System.out.print("Digite o nome do produto: ");
        String nome = leia.nextLine();

        System.out.print("Digite a Categoria (1 - Creme | 2 - Sabonete): ");
        int categoria = leia.nextInt();

        System.out.print("Digite o preço: ");
        float preco = leia.nextFloat();
        leia.nextLine();

        switch (categoria) {
            case 1 -> {
                System.out.print("Digite o tipo de pele: ");
                String tipoPele = leia.nextLine();
                produtoController.cadastrar(new Creme(produtoController.gerarId(),
                        nome, categoria, preco, tipoPele));
            }
            case 2 -> {
                System.out.print("Digite a fragrância: ");
                String fragrancia = leia.nextLine();
                produtoController.cadastrar(new Sabonete(produtoController.gerarId(),
                        nome, categoria, preco, fragrancia));
            }
            default -> System.out.println(Cores.TEXT_RED_BOLD + "Categoria inválida!" + Cores.RESET);
        }
    }

    private static void procurarProdutoPorId() {
        System.out.print("Digite o Id: ");
        int id = leia.nextInt();
        leia.nextLine();
        produtoController.procurarPorId(id);
    }

    private static void atualizarProduto() {
        System.out.print("Digite o Id: ");
        int id = leia.nextInt();
        leia.nextLine();

        Produto produto = produtoController.buscarNaCollection(id);

        if (produto != null) {
            String nome = produto.getNome();
            float preco = produto.getPreco();

            System.out.printf("Nome atual: %s | Novo Nome (ENTER p/ manter): ", nome);
            String entrada = leia.nextLine();
            nome = entrada.isEmpty() ? nome : entrada;

            System.out.printf("Preço atual: %.2f | Novo Preço (ENTER p/ manter): ", preco);
            entrada = leia.nextLine();
            preco = entrada.isEmpty() ? preco : Float.parseFloat(entrada);

            switch (produto.getCategoria()) {
                case 1 -> {
                    String tipoPele = ((Creme) produto).getTipoPele();
                    System.out.printf("Tipo de Pele atual: %s | Novo (ENTER p/ manter): ", tipoPele);
                    entrada = leia.nextLine();
                    tipoPele = entrada.isEmpty() ? tipoPele : entrada;
                    produtoController.atualizar(new Creme(id, nome, 1, preco, tipoPele));
                }
                case 2 -> {
                    String fragrancia = ((Sabonete) produto).getFragrancia();
                    System.out.printf("Fragrância atual: %s | Nova (ENTER p/ manter): ", fragrancia);
                    entrada = leia.nextLine();
                    fragrancia = entrada.isEmpty() ? fragrancia : entrada;
                    produtoController.atualizar(new Sabonete(id, nome, 2, preco, fragrancia));
                }
            }
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private static void deletarProduto() {
        System.out.print("Digite o Id: ");
        int id = leia.nextInt();
        leia.nextLine();
        produtoController.deletar(id);
    }
}
