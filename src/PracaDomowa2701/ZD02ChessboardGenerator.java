package PracaDomowa2701;

import java.util.Scanner;

public class ZD02ChessboardGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] userInput = sc.nextLine().toCharArray();
        char userColorChoice = sc.nextLine().charAt(0);
        boolean space = false;
        int spaceIndex = 0;

        //Sprawdzenie dlugosci poszczególnych współczynników
        int counterN = 0;
        int counterM = 0;
        for (int i = 0; i < userInput.length; i++) {
            if (userInput[i] == ' ' && !space && i != 0) { //Wykrycie zakocznenia pierwszej liczby
                space = true;
                spaceIndex = i;
            }
            if (userInput[i] == ' ' && !space && i == 0) { //Wykrycie zakocznenia pierwszej liczby
                continue;
            }
            if (userInput[i] == ' ' && space && counterM > 0) { //wykrycie zakonczenia drugiej liczby
                break;
            }
            if (!space && Character.isDigit(userInput[i])) { //obliczanie wielkosci pierwszej liczby
                counterN++;
            }
            if (space && Character.isDigit(userInput[i])) { //obliczanie wielkości drugiej liczby
                counterM++;
            }
        }

        //Przekształcenie tablicy char na int na podstawie ilości znaków
        int n = 0;
        for (int i = 0; i < counterN; i++) {
            if (userInput[i] != ' ') {
                n = (int) Math.pow(10, counterN - i - 1) * Character.getNumericValue(userInput[i]) + n;
            } else {
                counterN++;
            }
        }

        int m = 0;
        int counter = 0;
        for (int i = spaceIndex + 1; i < userInput.length; i++) {
            if (userInput[i] != ' ') {
                m = (int) Math.pow(10, counterM - counter - 1) * Character.getNumericValue(userInput[i]) + m;
                counter++;
            }
        }

        if (n > 0 && m > 0) {
//            System.out.println("Wielkosc planszy n x m: " + n + "x" + m);
//            System.out.println("Kolor początkowy: " + userColorChoice);
            boardGenerator(n, m, userColorChoice);
        } else {
            System.out.println("Błędny wymiar planszy");
        }
    }

    public static void boardGenerator(int n, int m, char color) {
        ZD02ChessboardGeneratorEnum[][] chessboard = new ZD02ChessboardGeneratorEnum[n][m];
        ZD02ChessboardGeneratorEnum zmienna = ZD02ChessboardGeneratorEnum.Black;
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                if (i % 2 == 0) { //start od koloru wybranego przez usera
                    if (j % 2 == 0) {
                        if (Character.toUpperCase(color) == zmienna.getName()) {
                            chessboard[i][j] = ZD02ChessboardGeneratorEnum.White;
                        } else {
                            chessboard[i][j] = ZD02ChessboardGeneratorEnum.Black;
                        }
                    } else {
                        if (Character.toUpperCase(color) == zmienna.getName()) {
                            chessboard[i][j] = ZD02ChessboardGeneratorEnum.Black;
                        } else {
                            chessboard[i][j] = ZD02ChessboardGeneratorEnum.White;
                        }
                    }
                } else { // start od koloru przeciwnego względem wybranego przez usera
                    if (j % 2 == 0) {
                        if (Character.toUpperCase(color) == zmienna.getName()) {
                            chessboard[i][j] = ZD02ChessboardGeneratorEnum.Black;
                        } else {
                            chessboard[i][j] = ZD02ChessboardGeneratorEnum.White;
                        }
                    } else {
                        if (Character.toUpperCase(color) == zmienna.getName()) {
                            chessboard[i][j] = ZD02ChessboardGeneratorEnum.White;
                        } else {
                            chessboard[i][j] = ZD02ChessboardGeneratorEnum.Black;
                        }
                    }
                }

            }

        }
        for ( int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                System.out.print(chessboard[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
