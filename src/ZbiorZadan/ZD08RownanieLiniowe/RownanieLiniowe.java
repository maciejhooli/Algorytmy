package ZbiorZadan.ZD08RownanieLiniowe;

import java.util.Scanner;

public class RownanieLiniowe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] userInput = sc.nextLine().split(" ");

        double a = Integer.parseInt(userInput[0]);
        double b = Integer.parseInt(userInput[1]);
        double c = Integer.parseInt(userInput[2]);

        double result = 0;
        System.out.printf("%.2f, %.2f, %.2f \n", a, b, c);
        if (a != 0) {
            System.out.printf("%.2f", ((c - b) / a));
        } else {
            if (b == c) {
                System.out.println("Równanie ma nieskończenie wiele rozwiązań");
            } else {
                System.out.println("Równanie nie ma rozwiązań");
            }
        }
    }
}
