import java.text.DecimalFormat;
import java.util.Scanner;

public class Investimento {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        double valorFinal = valorInicial;

        for (int i = 0; i < periodo; i++) {
            valorFinal += valorFinal * taxaJuros;
        }

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}