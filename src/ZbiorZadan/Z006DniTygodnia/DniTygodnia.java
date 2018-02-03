package ZbiorZadan.Z006DniTygodnia;

import java.util.Scanner;

public class DniTygodnia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startIndex = 0;

        char[] userInput = sc.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        int shift = 0;

        for (int i = 0; i < userInput.length; i++) {
            if (Character.isLetter(userInput[i])) {
                sb.append(userInput[i]);
            } else if (Character.isDigit(userInput[i])) {
                shift = Integer.parseInt(Character.toString(userInput[i]));
            }
        }

        for (int i = 0; i < WeekDays.values().length; i++) {
            if (WeekDays.values()[i].toString().equals(sb.toString()))
                startIndex = i;
        }

        shift = shift + startIndex;
        System.out.println(WeekDays.values()[shift % 7]);
    }
}
