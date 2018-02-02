package PracaDomowa2701;

import java.util.Scanner;

public class ZD05DayOfYear {
    private static int day = 0;
    private static int month = 0;
    private static int year = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] userInput = sc.nextLine().toCharArray();
        translateToInt(userInput);

        System.out.printf("%d %d %d", day, month, year);

    }

    private static void translateToInt(char[] userInput) {





    }


}