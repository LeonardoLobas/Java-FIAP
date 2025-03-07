package operadoreslogicos;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo!");

        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Tente adivinhar o número entre 1 a 10.");

        do {
            System.out.println("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("Você acertou, o numero era: " + numeroSecreto);
            }else {
                System.out.println("Tente novamente!");
            }
        } while (palpite != numeroSecreto);
        System.out.println("Você acertou em " + tentativas + " tentativas");
        scanner.close();
    }
}
