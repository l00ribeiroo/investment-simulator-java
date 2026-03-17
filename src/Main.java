//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simulador de Investimentos ===");

        System.out.print("Valor inicial: ");
        double initial = scanner.nextDouble();

        System.out.print("Aporte mensal: ");
        double monthly = scanner.nextDouble();

        System.out.print("Taxa de juros mensal (%): ");
        double rate = scanner.nextDouble() / 100;

        System.out.print("Tempo (meses): ");
        int months = scanner.nextInt();

        double total = initial;

        for (int i = 1; i <= months; i++) {
            total = total * (1 + rate) + monthly;
        }

        System.out.println("\nValor final do investimento: R$ " + String.format("%.2f", total));

        scanner.close(); // 👈 boa prática
    }
}