package primeiraaula;

import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("O aluno: " + nome + "possui a média " + media);

        scanner.close();
    }
}
