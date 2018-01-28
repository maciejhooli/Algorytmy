package ZbiorZadan.Z012WeryfikacjaPeselu;

import java.util.Scanner;

public class PeselCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] userPesel = sc.nextLine().toCharArray();
        int[] weights = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
        int checkPesel = 0;

        if (userPesel.length == 11 && peselCheck(userPesel)) {
            for (int i = 0; i < userPesel.length; i++) {
                for (int j = 0; j < weights.length; j++) {
                    if (i == j) {
                        checkPesel = checkPesel + Integer.parseInt(Character.toString(userPesel[i]))*weights[j];
                    }
                }
            }
            if(checkPesel%10 == 0){
                System.out.println("PESEL poprawny!");
            }
            else {
                System.out.println("PESEL zły");
            }
        } else {
            System.out.println("Błędny format PESEL!");
        }
    }

    public static boolean peselCheck(char[] pesel) {
        boolean result = true;
        for (int i = 0; i < pesel.length; i++) {
            if (Character.isDigit(pesel[i])) {
                result = result && true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
