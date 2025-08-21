package E1016;

import java.util.Scanner;

public class E1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();

        // O carro Y se aproxima 1 km a cada 2 minutos
        int tempo = distancia * 2;

        System.out.println(tempo + " minutos");

        sc.close();
    }
}
