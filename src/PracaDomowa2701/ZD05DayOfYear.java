package PracaDomowa2701;

import java.util.Scanner;

public class ZD05DayOfYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] userInput = sc.nextLine().toCharArray();
        ZD05Date data = new ZD05Date(userInput);
//TODO przerzucic to sprawdzenie do klasy
        if (data.dayOfYear() > 0) {
            System.out.println(data.dayOfYear());
        } else {
            System.out.println("nie ma takiego dnia");
        }
    }
}