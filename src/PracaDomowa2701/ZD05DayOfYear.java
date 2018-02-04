package PracaDomowa2701;

import java.util.Scanner;

public class ZD05DayOfYear {
    public static void main(String[] args) {
        //TODO POPRAWIC OBSLUGE DATY Z PO ZA ZAKRESU DNI MIESIACA!!!! TERMIN 09.02.2018
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        try {
            ZD05Date data = new ZD05Date(userInput);
            data.dayOfYear();
        } catch (Exception e){
            System.out.println(userInput + " => nie ma takiej daty");
        }


    }
}