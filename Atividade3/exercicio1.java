import java.util.ArrayList;
import java.util.Scanner;

class ItemEstoque {
    private String nome;
    private int quantidade;

    public ItemEstoque(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

class GerenciadorEstoque {
    private ArrayList<ItemEstoque> estoque;

    public GerenciadorEstoque() {
        estoque = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade) {
        estoque.add(new ItemEstoque(nome, quantidade));
    }

    public void removerItem(String nome) {
        for (ItemEstoque item : estoque) {
            if (item.getNome().equals(nome)) {
                estoque.remove(item);
                break;
            }
        }
    }

    public void listarItens() {
        System.out.println("\nItens no estoque:");
        for (ItemEstoque item : estoque) {
            System.out.println("Nome: " + item.getNome() + "\nQuantidade: " + item.getQuantidade());
        }
    }

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        for (ItemEstoque item : estoque) {
            if (item.getNome().equals(nome)) {
                item.setQuantidade(novaQuantidade);
                break;
            }
        }
    }
}

public class exercicio1 {
    public static void main(String[] args) {
        GerenciadorEstoque gerenciador = new GerenciadorEstoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Adicionar Item");
            System.out.println("2. Remover Item");
            System.out.println("3. Listar Itens");
            System.out.println("4. Atualizar Quantidade");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    String nome = scanner.next();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    gerenciador.adicionarItem(nome, quantidade);
                    System.out.println("Item adicionado ao estoque.");
                    break;
                case 2:
                    System.out.print("Digite o nome do item a ser removido: ");
                    nome = scanner.next();
                    gerenciador.removerItem(nome);
                    System.out.println("Item removido do estoque.");
                    break;
                case 3:
                    gerenciador.listarItens();
                    break;
                case 4:
                    System.out.print("Digite o nome do item a ser atualizado: ");
                    nome = scanner.next();
                    System.out.print("Digite a nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    gerenciador.atualizarQuantidade(nome, novaQuantidade);
                    System.out.println("Quantidade atualizada.");
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
