package operadoresLogicos;
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade:");
        idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Acesso concedido !");
        } else {
            System.out.println("Desculpe, você não tem permissão!");
        }

    }
}
