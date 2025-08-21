package E1017;

import java.util.Locale;
import java.util.Scanner;

public class E1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();

        // Distância = tempo * velocidade
        double distancia = tempo * velocidade;

        // Consumo = distância / 12 (KM/L)
        double litros = distancia / 12.0;

        System.out.printf("%.3f%n", litros);

        sc.close();
    }
}
