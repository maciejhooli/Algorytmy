package PracaDomowa0302;

import java.util.ArrayList;
import java.util.Scanner;

public class ZD02ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String userInput = sc.nextLine();

//        String userInput = "5 [2,3,4,1,9,5,8,5,5,5,9,6,8,4,5,5,5,6,6]";
        String userInput = "4 [1,2,2,3,4,2,4]";
        Integer number = Integer.parseInt(userInput.substring(0, userInput.indexOf('[')).trim());
        String[] userInputParse = userInput.substring(userInput.indexOf('[') + 1, userInput.indexOf(']')).trim().split(",");

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> valuesToDeleted = new ArrayList<>();
        for (int i = 0; i < userInputParse.length; i++) {
            arrayList.add(Integer.parseInt(userInputParse[i]));
        }


        for (Integer element : arrayList) {
            if (element.equals(number)) {
                valuesToDeleted.add(element);
            }
        }

        arrayList.removeAll(valuesToDeleted);

        StringBuilder sb = new StringBuilder();
        System.out.println(userInput);
        sb.append("[");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i));
            if (i != (arrayList.size() - 1))
                sb.append(",");

        }
        sb.append("]");
        System.out.print(sb.toString());

    }
}
