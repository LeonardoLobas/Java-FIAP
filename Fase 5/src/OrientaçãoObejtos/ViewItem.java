package OrientaçãoObejtos;

import java.util.Scanner;

public class ViewItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemPersonagem itemPersonagem = null;
        int op;
        do {
            System.out.println("Escolha uma opção: 1-Cadastrar Item 2-Exibir Item 0-Sair");
            op = sc.nextInt(); // Nextint solicita o usuario um inteiro e obtem o valor e o scanner escuta
            switch (op) {
                case 1:
                    System.out.println("Digite o nome do item:");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite a descrição do item:");
                    String descricao = sc.next() + sc.nextLine();
                    System.out.println("O item é raro ? True/False");
                    boolean raro = sc.nextBoolean();
                    System.out.println("Digite o nivel de porder do item:");
                    int nivelPoder = sc.nextInt();
                    itemPersonagem = new ItemPersonagem(nome,descricao,raro,nivelPoder);
                    break;
                case 2:
                    if(itemPersonagem != null) {
                        System.out.println("Nome: " + itemPersonagem);
                    } else {
                        System.out.println("Nenhum item cadastrado");
                    } break;
                case 0:
                    System.out.println("Finalizado o programa");
                    break;
                default:
                    System.out.println("Opcão inválida");
            }
        } while (op != 0);
        sc.close();
    }
}
