package E1043;

import java.util.Locale;
import java.util.Scanner;

public class E1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Verifica se forma triângulo
        if (A < B + C && B < A + C && C < A + B) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            double area = (A + B) * C / 2.0;
            System.out.printf("Area = %.1f%n", area);
        }

        sc.close();
    }
}
