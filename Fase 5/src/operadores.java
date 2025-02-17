import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        // Operadores aritméticos (+,-,*,/,**,--)
        // int x = 10;
        // int y = 5;
        // int soma = x + y;
        // System.out.println(soma);

        // int multiplicacao = x * 2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();
        scanner.nextLine(); // Consumir o '\n' pendente

        System.out.print("Digite um número decimal: ");
        double numeroDecimal = scanner.nextDouble();
        scanner.nextLine(); // Consumir o '\n' pendente

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        scanner.close();

    }
}
