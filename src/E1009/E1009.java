package E1009;

import java.util.Locale;
import java.util.Scanner;

public class E1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        double salarioFixo = sc.nextDouble();
        double vendas = sc.nextDouble();

        double totalReceber = salarioFixo + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", totalReceber);

        sc.close();
    }
}
