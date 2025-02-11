package operadoresLogicos;

import java.util.Scanner;

public class operadorIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ensolarado, finalDeSemana;

        // Receber informações do usuário sobre as condições
        System.out.print("Está ensolarado? (true para sim / false para não): ");
        ensolarado = scanner.nextBoolean();

        System.out.print("É final de semana? (true para sim / false para não): ");
        finalDeSemana = scanner.nextBoolean();

        // Verificar as condições para decidir o destino do passeio
        if (ensolarado && finalDeSemana) {
            System.out.println("Vamos à praia para aproveitar o sol!");
        }
    }
}