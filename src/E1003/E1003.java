package E1003;

import java.util.Scanner;

public class E1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, soma;

        a = sc.nextInt();
        b = sc.nextInt();

        soma = a + b;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
