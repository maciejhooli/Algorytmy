package ZbiorZadan.Z11NWW;

import java.util.Scanner;

public class Nww {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        int a = 0;
        int b = 0;

        try {
            a = Integer.parseInt(userInput.substring(0, userInput.indexOf(' ')));
            b = Integer.parseInt(userInput.substring(userInput.indexOf(' ') + 1));
        } catch (Exception e) {
            System.out.println("Podałeś błędne dane wejściowe");
            return;
        }

        System.out.printf("NWD(%d,%d)=%d", a, b, (a * b) / NWD(a, b));

    }

    public static int NWD(int a, int b) {
        while (true) {
            if (a == b) {
                return a;
            } else {
                if (a < b) {
                    b = b - a;
                } else {
                    a = a - b;
                }
            }
        }
    }
}
