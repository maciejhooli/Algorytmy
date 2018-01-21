package Projekty.OneHundredCounting;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class OneHundredGame {
    private int actualresult = 100;
    public void startGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int userChoice = 0;
        int compChoice = 0;
        System.out.println("Witaj w grze w 100");
        while (actualresult >= 1) {
            System.out.println("Podaj wartość między 1-10.");
            try {
                userChoice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Złe dane!! Podaj jeszcze raz");
                sc.next();
                continue;
            }
            actualresult -= userChoice;
            System.out.println("Actual result after user: " + actualresult);
            if (gameEnd()){
                System.out.println("User WIN!!");
                break;
            }
            if(actualresult>10) {
                compChoice = rand.nextInt(10)+1;
            }
            else {
                compChoice = rand.nextInt(actualresult)+1;
            }
            System.out.println("Comp choice: " + compChoice);
            actualresult-=compChoice;
            System.out.println("Actual result after comp: " + actualresult);
            if(gameEnd()){
                System.out.println("Comp WIN");
                break;
            }
        }
    }
    private boolean gameEnd(){
        return (actualresult<=1);
    }
}
