package ZbiorZadan.Z07ImieninyJasia;

import java.util.Scanner;

public class ImieninyJasia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość dzieci oraz po spacji ilośc cukierków.");
        String userInput = sc.nextLine();
        int numberOfChildrenInClass = 0;
        int numberOfSweets = 0;
        try {
            numberOfSweets = Integer.parseInt(userInput.substring(0, userInput.indexOf(' ')).trim());
            numberOfChildrenInClass = Integer.parseInt(userInput.substring(userInput.indexOf(' ')+1).trim());
        } catch (Exception e) {
            System.out.println("Podałeś niewłaściwe dane na wejście!");
            return;
        }

        if (numberOfSweets%(numberOfChildrenInClass-1) > 0 ){
            System.out.printf("%d %d => TAK %d", numberOfSweets, numberOfChildrenInClass, numberOfSweets%(numberOfChildrenInClass-1));
        } else {
            System.out.printf("%d %d => NIE", numberOfSweets, numberOfChildrenInClass);
        }

    }
}
