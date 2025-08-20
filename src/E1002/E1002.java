package E1002;

import java.util.Locale;
import java.util.Scanner;

public class E1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi, raio, area;

        pi = 3.14159;
        raio = sc.nextDouble();

        area = Math.pow(raio, 2) * pi;

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
