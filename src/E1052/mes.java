package E1052;

import java.util.Scanner;

public class mes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        String[] meses = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        }; // ou podia fazer if else infinito, ou ate mesmo utilizar switch infinito tbm rs


        System.out.println(meses[numero - 1]);

        sc.close();
    }
}
