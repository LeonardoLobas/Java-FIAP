package OrientaçãoObejtos.atividade;

import java.util.Scanner;

public class LojaMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        int opcao;
        do{
            System.out.println("Escolha uma das opções: 1 - Cadastrar produto; 2 - Exibir infos; 3 - Comprar produto; 4 - Adição ao estoque; 5 - Desconto; 0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o preço do produto");
                    double preco = sc.nextDouble();
                    System.out.println("Digite a quantiade em estoque do produto");
                    int estoque = sc.nextInt();
                    produto = new Produto(nome,preco,estoque);
                    break;
                case 2:
                    produto.exibirInformacoes();
                    break;
                case 3:
                    System.out.println("Digite a quantiade da compra");
                    int quantidade = sc.nextInt();
                    produto.comprar(quantidade);
                    break;
                case 4:
                    System.out.println("Digite a quantiade para add em estoque");
                    quantidade = sc.nextInt();
                    produto.adicionarEstoque(quantidade);
                    break;
                case 5:
                    System.out.println("Digite a porcentagem de desconto");
                    double desconto = sc.nextDouble();
                    produto.aplicarDesconto(desconto);
                    break;
                case 0:
                    System.out.println("Finalizando...");
                    break;
                default:
                System.out.println("Opção inválida");
            }
        }while (opcao != 0);
        sc.close();
    }
}