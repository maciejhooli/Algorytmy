package Projekty.PaperScissorsRock;

import java.util.Random;
import java.util.Scanner;

public class PapScisRockMain {
    public static int totalGames = 0;
    public static int gameDraw = 0;
    public static int userGamesWin = 0;
    public static int compGameWin = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        String userChoice = " ";
        String compChoice = " ";

        while (true) {
            System.out.println("Grasz w papier/kamien/nozyczki. Wybierz opcję:");
            System.out.println("q - wyjscie z gry");
            System.out.println("n - nożyczki");
            System.out.println("p - papier");
            System.out.println("k - kamien");
            userChoice = sc.next().toLowerCase().trim();
            if (userChoice.equals("q")) {
                showStats();
                break;
            }
            compChoice = randToString(rand.nextInt(3));
            System.out.printf("User choice: %s, comp choice: %s\n", userChoice, compChoice);
            if (userChoice.equals("k") || userChoice.equals("n") || userChoice.equals("p")) {
                whoWins(userChoice, compChoice);
            } else {
                System.out.println("Błąd");
                continue;
            }
        }

    }

    public static String randToString(int rand) {
        String result = "";
        switch (rand) {
            case 0:
                result = "p";
                break;
            case 1:
                result = "k";
                break;
            case 2:
                result = "n";
                break;

        }
        return result;
    }

    public static void showStats() {
        System.out.printf("Total games: %d.\nUser win: %d.\nComp win: %d.\nDraw: %d\n", totalGames, userGamesWin, compGameWin, gameDraw);
    }


    public static void whoWins(String userChoice, String compChoice) {
        totalGames++;
        if (Figures.getEnumBasedOnString(userChoice).equals(Figures.getEnumBasedOnString(compChoice))) {
            System.out.println("REMIS!");
            gameDraw++;
        } else if (Figures.getEnumBasedOnString(userChoice).equals(Figures.SCISORS) && Figures.getEnumBasedOnString(compChoice).equals(Figures.ROCK)) {
            System.out.println("COMP WINS");
            compGameWin++;
        } else if (Figures.getEnumBasedOnString(userChoice).equals(Figures.SCISORS) && Figures.getEnumBasedOnString(compChoice).equals(Figures.PAPER)) {
            System.out.println("USER WINS");
            userGamesWin++;
        } else if (Figures.getEnumBasedOnString(userChoice).equals(Figures.ROCK) && Figures.getEnumBasedOnString(compChoice).equals(Figures.SCISORS)) {
            System.out.println("USER WINS");
            userGamesWin++;
        } else if (Figures.getEnumBasedOnString(userChoice).equals(Figures.ROCK) && Figures.getEnumBasedOnString(compChoice).equals(Figures.PAPER)) {
            System.out.println("COMP WINS");
            compGameWin++;
        } else if (Figures.getEnumBasedOnString(userChoice).equals(Figures.PAPER) && Figures.getEnumBasedOnString(compChoice).equals(Figures.SCISORS)) {
            System.out.println("COMP WINS");
            compGameWin++;
        } else if (Figures.getEnumBasedOnString(userChoice).equals(Figures.PAPER) && Figures.getEnumBasedOnString(compChoice).equals(Figures.ROCK)) {
            System.out.println("USER WINS");
            userGamesWin++;
        }

        showStats();
    }

}
