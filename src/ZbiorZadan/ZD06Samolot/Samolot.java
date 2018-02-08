package ZbiorZadan.ZD06Samolot;

import java.util.Scanner;

public class Samolot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        int n1 = Integer.parseInt(userInput.substring(0, userInput.indexOf(' ')).trim());
        String temp = userInput.substring(userInput.indexOf(' ') + 1);
        int k1 = Integer.parseInt(temp.substring(0, userInput.indexOf(' ')).trim());
        temp = temp.substring(userInput.indexOf(' ') + 1);
        int n2 = Integer.parseInt(temp.substring(0, userInput.indexOf(' ')+1).trim());
        temp = temp.substring(userInput.indexOf(' ') + 1).trim();
        int k2 = Integer.parseInt(temp);

        int placesInPlane = n1 * k1 + n2 * k2;
        System.out.println("Ilość miejsc na pokładzie: " + placesInPlane);

    }
}
