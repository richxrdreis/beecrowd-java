package E1060;

import java.util.Locale;
import java.util.Scanner;

public class numerosPositivos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] vetor = new double[6];

        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            vetor[i] = sc.nextDouble();

            if (vetor[i] > 0) {
                positivos++;
            }
        }

        System.out.print(positivos + " valores positivos");
    }
}
