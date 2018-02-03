package Zajecia0302;

import java.util.Scanner;

public class WyszukiwanieMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = "[1,4,78,3]";//sc.nextLine();
        String values = userInput.substring(userInput.indexOf("[") + 1, userInput.indexOf("]")).trim();
        String[] val = values.split(",");

        int[] valuesInt = new int[val.length];
        for (int i = 0; i < val.length; i++) {
            valuesInt[i] = Integer.parseInt(val[i]);
        }

        int indexMin = -1;
        int indexMax = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < valuesInt.length; i++) {
            if (min > valuesInt[i]) {
                min = valuesInt[i];
                indexMin = i;
            }
            if (max < valuesInt[i]) {
                max = valuesInt[i];
                indexMax = i;
            }

        }
        System.out.println("Min: " + indexMin + "(" + min + ")");
        System.out.println("Max: " + indexMax + "(" + max + ")");
    }

}
