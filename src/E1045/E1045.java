package E1045;

import java.util.Locale;
import java.util.Scanner;

public class E1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        // Ordena em ordem decrescente
        double A = Math.max(x, Math.max(y, z));
        double C = Math.min(x, Math.min(y, z));
        double B = x + y + z - A - C; // o lado do meio

        // Verifica se forma triângulo
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // Classificação por ângulo
            if (Math.abs(A*A - (B*B + C*C)) < 1e-9) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A*A > B*B + C*C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (A*A < B*B + C*C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            // Classificação por lados
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
