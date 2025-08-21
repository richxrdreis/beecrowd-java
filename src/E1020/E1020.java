package E1020;

import java.util.Scanner;

public class E1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDias = sc.nextInt();

        int anos = totalDias / 365;
        int meses = (totalDias % 365) / 30;
        int dias = (totalDias % 365) % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        sc.close();
    }
}
