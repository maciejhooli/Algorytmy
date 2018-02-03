package Zajecia0302;

public class WyszukiwanieLidera {
    public static void main(String[] args) {
        String userInput = "[1,1,5,5,6,6,3,5,4]";//"[1,2,2,2,1,6,2]";//sc.nextLine();
        String values = userInput.substring(userInput.indexOf("[") + 1, userInput.indexOf("]")).trim();
        String[] val = values.split(",");

        int[] valuesInt = new int[val.length];
        for (int i = 0; i < val.length; i++) {
            valuesInt[i] = Integer.parseInt(val[i]);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < valuesInt.length; i++) {
            if (max < valuesInt[i]) {
                max = valuesInt[i];
            }
        }
        int[] tabZlicz = new int[max + 1];
        for (int i = 0; i < valuesInt.length; i++) {
            tabZlicz[valuesInt[i]]++;
        }

        int index = 0;
        for (int i = 0; i < tabZlicz.length; i++) {
            if (tabZlicz[index] < tabZlicz[i]) {
                index = i;
            }
        }

        if (max / (double) tabZlicz.length >= 0.5) {
            System.out.println(index);
        } else
            System.out.println(-1);
    }
}
