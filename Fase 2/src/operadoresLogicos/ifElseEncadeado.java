package operadoresLogicos;

import java.util.Scanner;

public class ifElseEncadeado {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        double valorTotal;
        int frequencia;
        System.out.println("Informe o valor total de sua compras esse ano: ");
        valorTotal = scanner.nextInt();
        System.out.println(("Quantas vezes você realizou compras na loja esse ano? "));
        frequencia = scanner.nextInt();

        if (valorTotal >= 2000 && frequencia >= 10) {
            System.out.println("Parabéns! Você é VIP");
        } else if (valorTotal >= 1000) {
            System.out.println("Você está na categoria prata !");
        } else {
            System.out.println("Que pena! Você é bronze !");
        }

    }
}
