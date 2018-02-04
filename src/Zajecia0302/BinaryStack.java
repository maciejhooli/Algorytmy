package Zajecia0302;

import java.util.Stack;

public class BinaryStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        int l = 22;
        int p = 8;

        while (l > 0) {

            st.push(translation(l % p));
            l = l / p;
        }

        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }
    }

    private static String translation(int number) {
        switch (number) {
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
            default:
                return Integer.toString(number);
        }
    }

}
