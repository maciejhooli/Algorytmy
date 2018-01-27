package Zajecia2701;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj banknoty:");
        int banknoty = sc.nextInt();
        int banknoty2 = banknoty;
        System.out.println("Podaj grosze:");
        int grosze = sc.nextInt();
        int grosze2 = grosze;


        //Algorytm najprostrzy
        int[] nominalyZl = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] a1NominalyZuzycieZl = a1Zuzycie(nominalyZl, banknoty);

        int[] nominalyGr = {50, 20, 10, 5, 2, 1};
        int[] a1NominalyZuzycieGr = a1Zuzycie(nominalyGr, grosze);

        show(nominalyZl, a1NominalyZuzycieZl);
        show(nominalyGr, a1NominalyZuzycieGr);


        //ALGORYTM NR 2 - MACIEK
        int[] a2NominalyZuzycieZl = a2Zuzycie(nominalyZl, banknoty2);
        show(nominalyZl, a2NominalyZuzycieZl);


        int[] a2NominalyZuzycieGr = a2Zuzycie(nominalyGr, grosze2);
        show(nominalyGr, a2NominalyZuzycieGr);
    }


    public static int[] a1Zuzycie(int[] nominaly, int amount) {
        int[] nominalyZuzycie = new int[nominaly.length];
        int iterator = 0;
        while (amount > 0) {
            if (nominaly[iterator] <= amount) {
                amount -= nominaly[iterator];
                nominalyZuzycie[iterator]++;
            } else {
                iterator++;
            }
            if (iterator == nominaly.length) {
                break;
            }
        }
        return nominalyZuzycie;
    }

    public static int[] a2Zuzycie(int[] nominaly, int amount) {
        int[] nominalyZuzycie = new int[nominaly.length];
        while (amount > 0) {
            for (int i = 0; i < nominalyZuzycie.length; i++) {
                nominalyZuzycie[i] = amount / nominaly[i];
                amount = amount % nominaly[i];
            }
        }
        return nominalyZuzycie;
    }

    public static void show(int[] nominaly, int[] nominalyZuz) {
        for (int i = 0; i < nominalyZuz.length; i++) {
            if (nominalyZuz[i] > 0) {
                System.out.printf("%d: %d\n", nominaly[i], nominalyZuz[i]);
            }
        }
    }
}
