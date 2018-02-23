package PracaDomowa2701;

import java.util.Scanner;

public class ZD05DayOfYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        ZD05Date data = null;
        try {
            data = new ZD05Date(userInput);
        } catch (Exception e){
            System.out.println(userInput + " => nie ma takiej daty");
        }

        data.dayOfYear();


    }
}