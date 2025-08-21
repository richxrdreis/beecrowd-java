package E1040;

import java.util.Locale;
import java.util.Scanner;

public class E1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        // calcula a média ponderada
        double media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10.0;

        // truncar para 1 casa decimal
        media = Math.floor(media * 10.0) / 10.0;

        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double exame = sc.nextDouble();

            // também truncar a nota do exame
            exame = Math.floor(exame * 10.0) / 10.0;
            System.out.printf("Nota do exame: %.1f%n", exame);

            double mediaFinal = (media + exame) / 2.0;
            mediaFinal = Math.floor(mediaFinal * 10.0) / 10.0;

            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", mediaFinal);
        }

        sc.close();
    }
}
