package PracaDomowa0302;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ZD04Palindrom {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>();
            Stack<Integer> st = new Stack<>();

            //Stałe wywołanie kodu
//        int[] example1 = {1, 2, 3, 4, 5};
//        int[] example2 = {1, 2, 3, 2, 1};
//        for (int i = 0; i < example1.length; i++) {
//            list.add(example2[i]);
//        }

            //Zmienne wywołanie kodu
            String[] userInput = sc.next().trim().split(",");
            for (int i = 0; i < userInput.length; i++) {
                list.add(Integer.parseInt(userInput[i]));
            }

            for (int i = 0; i < list.size() / 2; i++) {
                st.push(list.get(i));
            }


            boolean isPalindrom = true;
            for (int i = (list.size() + 1) / 2; i < list.size(); i++) {
                isPalindrom = (st.peek() == list.get(i)) ? true && isPalindrom : false && isPalindrom;
                st.pop();
            }

            System.out.printf("Liczba %s. Jest palindromem: %b", list.toString(), isPalindrom);
        }
    }
