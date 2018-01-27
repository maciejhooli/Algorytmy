package Zajecia2701;

import java.util.Scanner;

public class SitoErystotelesa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] matrixM = new boolean[n + 1];
        boolean[] matrixK = new boolean[n + 1];


        for (int i = 0; i < matrixM.length; i++) {
            matrixM[i] = true;
            matrixK[i] = true;
        }

        //Rozwiązanie Maciek
        for (int i = 2; i < matrixM.length; i++) {
            if (matrixM[i]) {
                for (int j = i + 1; j < matrixM.length; j++) {
                    if (j % i == 0) {
                        matrixM[j] = false;
                    }
                }
            }
        }

        //Rozwiązanie zajęcia
        for (int i = 2; i < matrixK.length; i++) {
            if (matrixK[i]) {
                for (int j = i + i; j < matrixK.length; j += i) {
                    matrixK[j] = false;
                }
            }
        }

        System.out.println("Wynik - liczby pierwsze:");
        for (int i = 0; i < matrixM.length; i++) {
            if (matrixM[i] && matrixK[i]) {
                System.out.printf("%d\n", i);
            }
        }
    }
}
