import java.text.DecimalFormat;
import java.util.Scanner;
public class Investimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Solicita ao usuário que insira o valor inicial de investimento
        System.out.print("Digite o valor inicial de investimento: ");
        double valorInicial = scanner.nextDouble();

        System.out.println();

        // Solicita ao usuário que insira a taxa de juros anual
        System.out.print("Digite a taxa de juros anual (em decimal): ");
        double taxaJuros = scanner.nextDouble();

        System.out.println();

        // Solicita ao usuário que insira a quantidade de anos de investimento
        System.out.print("Digite a quantidade de anos de investimento: ");
        int periodo = scanner.nextInt();
        double valorFinal = valorInicial;

        for (int i = 0; i < periodo; i++) {
            valorFinal += valorFinal * taxaJuros;
        }

        System.out.println();

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }
}
