package E1046;

import java.util.Scanner;

public class E1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int fim = sc.nextInt();

        int duracao;

        if (inicio < fim) {
            duracao = fim - inicio;
        } else {
            duracao = 24 - inicio + fim;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

        sc.close();
    }
}
