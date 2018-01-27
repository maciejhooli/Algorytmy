package Zajecia2701;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        //Rozwiazanie 1 - Maciek
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            try {
//                suma += sc.nextInt();
//                System.out.println(suma);
//            } catch (IllegalArgumentException e) {
//        sc.next();
//                System.out.println(suma);
//            }
//        }

        //Rozwiązanie 2 - Maciek
//        while (true) {
//            try {
//                suma += sc.nextInt();
//                System.out.println(suma);
//            } catch (InputMismatchException e) {
//                sc.next();
//                System.out.println(suma);
//                break;
//            }
//        }

        //Rozwiązanie z zajęć
        int n = 0;
        try {
            n = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Podałeś błędne dane!");
        }
        for (int i = 0; i < n; i++) {
            try {
                suma += sc.nextInt();
                System.out.println(suma);
            } catch (Exception e) {
                sc.next();
                System.out.println(suma);
            }
        }

    }
}
