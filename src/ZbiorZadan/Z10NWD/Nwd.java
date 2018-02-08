package ZbiorZadan.Z10NWD;

import java.util.Scanner;

public class Nwd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput  = sc.nextLine();
        int a =0;
        int b = 0;

        try {
            a = Integer.parseInt(userInput.substring(0, userInput.indexOf(' ')));
            b = Integer.parseInt(userInput.substring(userInput.indexOf(' ')+1));
        } catch (Exception e){
            System.out.println("Podałeś błędne dane wejściowe");
            return;
        }
        while (true) {
            if (a == b) {
                System.out.printf("Wynik NWD = %d", a);
                break;
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
