package E1008;

import java.util.Locale;
import java.util.Scanner;

public class E1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int horas = sc.nextInt();
        double valorHora = sc.nextDouble();

        double salario = horas * valorHora;

        System.out.printf("NUMBER = %d%n", numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
