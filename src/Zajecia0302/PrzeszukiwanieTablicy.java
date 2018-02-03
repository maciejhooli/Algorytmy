package Zajecia0302;

import java.util.Scanner;

public class PrzeszukiwanieTablicy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = "4 [1,4,78,3]";//sc.nextLine();
        int number = Integer.parseInt(userInput.substring(0, userInput.indexOf("[")).trim());
        String values = userInput.substring(userInput.indexOf("[") + 1, userInput.indexOf("]")).trim();
        String[] val = values.split(",");

        int[] valuesInt = new int[val.length];
        for (int i = 0; i < val.length; i++) {
            valuesInt[i] = Integer.parseInt(val[i]);
        }

        int index2 = -1;
        boolean found = false;
        for (int i = 0; i < valuesInt.length / 2; i++) {
            if (valuesInt[i] == number) {
                index2 = i + 1;
                found = true;
                break;
            }
        }
        if (!found) {
            for (int i = valuesInt.length / 2; i < valuesInt.length; i++) {
                if (valuesInt[i] == number) {
                    index2 = i + 1;
                }
            }
        }

        System.out.println(index2);

//
//        int index = -1;
//        for (int i = 0; i < valuesInt.length; i++) {
//            if (valuesInt[i] == number) {
//                index = i + 1;
//                break;
//            }
//        }
//        System.out.println(index);

    }
}
