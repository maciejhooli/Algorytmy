package ZbiorZadan.Z004SpacjaCamelCaseInverse;

import java.util.Scanner;

public class SpaceCamelCaseInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] userTextArray = sc.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < userTextArray.length; i++) {
            if (Character.isUpperCase(userTextArray[i]) && i != 0) {
                sb.append(' ').append(Character.toLowerCase(userTextArray[i]));
            } else {
                sb.append(userTextArray[i]);
            }
        }
        System.out.print(sb.toString());
    }

}

