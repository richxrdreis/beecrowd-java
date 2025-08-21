package E1047;

import java.util.Scanner;

public class E1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int inicioTotal = horaInicial * 60 + minutoInicial;
        int fimTotal = horaFinal * 60 + minutoFinal;

        int duracao;

        if (fimTotal > inicioTotal) {
            duracao = fimTotal - inicioTotal;
        } else {
            duracao = (24 * 60 - inicioTotal) + fimTotal;
        }

        int horas = duracao / 60;
        int minutos = duracao % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horas, minutos);

        sc.close();
    }
}
