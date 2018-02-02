package PracaDomowa2701;

import java.util.Scanner;

public class ZD04AnswerCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] kuba = sc.nextLine().toCharArray();
        char[] zenek = sc.nextLine().toCharArray();
        char[] bogdan = sc.nextLine().toCharArray();

        int result = 0;

        if (checkLength(kuba.length, zenek.length, bogdan.length)) {
            for (int i = 0; i < kuba.length; i++) {
                if (checkLetters(Character.toUpperCase(kuba[i])) && checkLetters(Character.toUpperCase(zenek[i])) && checkLetters(Character.toUpperCase(bogdan[i]))) {
                    if (Character.toUpperCase(kuba[i]) != Character.toUpperCase(zenek[i]) && Character.toUpperCase(kuba[i]) != Character.toUpperCase(bogdan[i])) {
                        result++;
                    }
                } else {
                    System.out.println("Nieprawidłowe litery");
                    return;
                }
            }
                System.out.println("WYNIK: " + result*2);

        }
    }


    private static boolean checkLetters(char letter) {
        return letter == 'A' || letter == 'B' || letter == 'C' || letter == 'D';
    }

    private static boolean checkLength(int lengthA, int lengthB, int lengthC){
        return ((lengthA == lengthB) && (lengthA == lengthC));
    }

}