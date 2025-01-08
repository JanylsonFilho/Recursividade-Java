package permut;

import java.util.Scanner;
import java.util.Scanner;

public class Permuta {

    public static void printGoals(int m, int n, String result) {
        // Caso base: sem gols restantes para ambas as equipes
        if (m == 0 && n == 0) {
            System.out.println(result);
            return;
        }

        // Caso recursivo: adicionar um gol de A se houver gols restantes para A
        if (m > 0) {
            printGoals(m - 1, n, result + "A ");
        }

        // Caso recursivo: adicionar um gol de B se houver gols restantes para B
        if (n > 0) {
            printGoals(m, n - 1, result + "B ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de gols da equipe A: ");
        int m = scanner.nextInt();

        System.out.print("Informe o número de gols da equipe B: ");
        int n = scanner.nextInt();

        System.out.println("Todas as possíveis sucessões de gols:");
        printGoals(m, n, "");

        scanner.close();
    }
}
