package E1049;

import java.util.Scanner;

public class E1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tipo = sc.nextLine();

        String classe = sc.nextLine();

        String alimentacao = sc.nextLine();

        switch (tipo) {
            case "vertebrado":
                switch (classe) {
                    case "ave":
                        switch (alimentacao) {
                            case "carnivoro":
                                System.out.println("aguia");
                                break;
                            case "onivoro":
                                System.out.println("pomba");
                                break;
                        }
                        break;
                    case "mamifero":
                        switch (alimentacao) {
                            case "onivoro":
                                System.out.println("homem");
                                break;
                            case "herbivoro":
                                System.out.println("vaca");
                                break;
                        }
                        break;
                }
                break;

            case "invertebrado":
                switch (classe) {
                    case "inseto":
                        switch (alimentacao) {
                            case "hematofago":
                                System.out.println("pulga");
                                break;
                            case "herbivoro":
                                System.out.println("lagarta");
                                break;
                        }
                        break;
                    case "anelideo":
                        switch (alimentacao) {
                            case "hematofago":
                                System.out.println("sanguessuga");
                                break;
                            case "onivoro":
                                System.out.println("minhoca");
                                break;
                        }
                        break;
                }
                break;
        }

        sc.close();
    }
}
