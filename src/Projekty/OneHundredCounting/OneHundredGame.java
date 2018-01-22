package Projekty.OneHundredCounting;

import java.util.Random;
import java.util.Scanner;

public class OneHundredGame {
    private int actualresult = 100;

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int userChoice = 0;
        int compChoice = 0;
        String levelChoice = " ";
        System.out.println("Witaj w grze w 100");
        System.out.println("Wybierz level gry:");
        System.out.println("l - losowy");
        System.out.println("s - strategiczny");
        levelChoice = sc.next().toLowerCase();
        if (levelChoice.equals("l") || levelChoice.equals("s")) {
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
                if (gameEnd()) {
                    System.out.println("User WIN!!");
                    break;
                }

                if (levelChoice.equals("l")) {
                    if (actualresult > 10) {
                        compChoice = rand.nextInt(10) + 1;
                    } else {
                        compChoice = rand.nextInt(actualresult) + 1;
                    }
                } else if (levelChoice.equals("s")) {
                    compChoice = 11 - userChoice;
                }

                System.out.println("Comp choice: " + compChoice);
                actualresult -= compChoice;
                System.out.println("Actual result after comp: " + actualresult);
                if (gameEnd()) {
                    System.out.println("Comp WIN");
                    break;
                }
            }
        } else System.out.println("Błędnie wybrany poziom gry.");
    }

    private boolean gameEnd() {
        return (actualresult <= 1);
    }
}
