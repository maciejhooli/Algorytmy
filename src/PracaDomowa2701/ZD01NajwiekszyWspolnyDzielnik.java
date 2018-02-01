package PracaDomowa2701;

import java.util.Scanner;

public class ZD01NajwiekszyWspolnyDzielnik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] userInput = sc.nextLine().toCharArray();
        boolean space = false;
        int spaceIndex = 0;

        //Sprawdzenie dlugosci poszczególnych współczynników
        int counterN = 0;
        int counterK = 0;
        for (int i = 0; i < userInput.length; i++) {
            if (userInput[i] == ' ' && !space) {
                space = true;
                spaceIndex = i;
            }
            if (!space && Character.isDigit(userInput[i])) {
                counterN++;
            }
            if (space && Character.isDigit(userInput[i])) {
                counterK++;
            }
        }

        //Przekształcenie tablicy char na int na podstawie ilości znaków
        int n = 0;
        for (int i = 0; i < counterN; i++) {
            n = (int) Math.pow(10, counterN - i - 1) * Character.getNumericValue(userInput[i]) + n;
        }

        int k = 0;
        int counter = 0;
        for (int i = spaceIndex + 1; i < userInput.length; i++) {
            k = (int) Math.pow(10, counterK - counter - 1) * Character.getNumericValue(userInput[i]) + k;
            counter++;
        }

        //Docelowe wyliczenie NWD
        try {
            System.out.println(nwd(n, k));
        } catch (Exception e){
            System.out.println("Nieprawidłowa operacja");
        }
    }


    public static int nwd(int n, int k) throws Exception {
        if (n % k > 0)
            return nwd(k, n % k);
        else
            return k;
    }
}
