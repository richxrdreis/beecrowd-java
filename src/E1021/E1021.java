package E1021;

import java.util.Locale;
import java.util.Scanner;

public class E1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Lê como double e converte para centavos
        double N = sc.nextDouble();
        int valor = (int) Math.round(N * 100.0); // sempre arredonda corretamente

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int qtd = valor / nota;
            valor %= nota;
            System.out.printf("%d nota(s) de R$ %d.00%n", qtd, nota / 100);
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int qtd = valor / moeda;
            valor %= moeda;
            if (moeda == 100) {
                System.out.printf("%d moeda(s) de R$ 1.00%n", qtd);
            } else {
                System.out.printf("%d moeda(s) de R$ 0.%02d%n", qtd, moeda);
            }
        }

        sc.close();
    }
}
