package E1042;

import java.util.Arrays;
import java.util.Scanner;

public class E1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] original = new int[3];
        original[0] = sc.nextInt();
        original[1] = sc.nextInt();
        original[2] = sc.nextInt();

        int[] crescente = original.clone();
        Arrays.sort(crescente); // ordena em ordem crescente

        // imprime em ordem crescente
        for (int i = 0; i < 3; i++) {
            System.out.println(crescente[i]);
        }

        System.out.println(); // linha em branco

        // imprime na ordem original
        for (int i = 0; i < 3; i++) {
            System.out.println(original[i]);
        }

        sc.close();
    }
}
