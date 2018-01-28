package ZbiorZadan.Z009WeryfikacjaDowodu;

import java.util.Scanner;

public class PersonalId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] userId = sc.nextLine().toUpperCase().toCharArray();
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] lettersWeights = new int[letters.length];
        int[] weights = {7, 3, 1, 9, 7, 3, 1, 7, 3};
        int[] numbersToCheck = new int[weights.length];
        int checkSum = 0;
        lettersWeights = fillWeights(letters.length);

        if (userId.length == 9 && idCheck(userId)) {
            for (int i = 0; i < userId.length; i++) {
                for (int j = 0; j < letters.length; j++) {
                    if (i < 3) {
                        if (letters[j] == userId[i]) {
                            numbersToCheck[i] = lettersWeights[j];
                        }
                    } else {
                        numbersToCheck[i] = Integer.parseInt(Character.toString(userId[i]));
                    }
                }
            }
            for (int i = 0; i < numbersToCheck.length; i++) {
                for (int j = 0; j < weights.length; j++) {
                    if (i == j) {
                        checkSum = checkSum + numbersToCheck[i] * weights[j];
                    }
                }
            }
            if (checkSum % 10 == 0) {
                System.out.println("Dowód jest poprawny");
            }
            else System.out.println("Numer dowodu nieprawidziwy");
        } else {
            System.out.println("Błędny numer dowodu");
        }
    }

    public static int[] fillWeights(int length) {
        int[] weights = new int[length];
        int counter = 10;
        for (int i = 0; i < weights.length; i++) {
            weights[i] = counter;
            counter++;
        }
        return weights;
    }

    public static boolean idCheck(char[] id) {
        boolean result = true;
        for (int i = 0; i < id.length; i++) {
            if (i < 3) {
                if (Character.isLetter(id[i])) {
                    result = true && result;
                } else result = false;
            } else {
                if (Character.isDigit(id[i])) {
                    result = true && result;
                } else result = false;
            }

        }
        return result;
    }
}
