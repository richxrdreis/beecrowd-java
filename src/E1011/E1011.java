package E1011;

import java.util.Locale;
import java.util.Scanner;

public class E1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double pi = 3.14159;

        double volume = (4.0 / 3) * pi * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();
    }
}
