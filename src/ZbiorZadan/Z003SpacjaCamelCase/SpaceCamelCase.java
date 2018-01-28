package ZbiorZadan.Z003SpacjaCamelCase;

import java.util.Scanner;

public class SpaceCamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] userTextArray = sc.nextLine().toCharArray();
        char[] userOutput = new char[userTextArray.length];
        boolean isUpperCase = false;

        for (int i = 0; i < userTextArray.length; i++) {
            if (userTextArray[i] != ' ') {
                if (isUpperCase) {
                    userOutput[i] = Character.toUpperCase(userTextArray[i]);
                    isUpperCase = false;
                } else {
                    userOutput[i] = userTextArray[i];
                }
            } else {
                isUpperCase = true;
            }
        }

        for (int i = 0; i < userOutput.length; i++) {
            System.out.print(userOutput[i]);
        }
    }
}
