package ZbiorZadan.Z15ONP;

import java.util.Scanner;
import java.util.Stack;

public class ONP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = "3 5 2 + *";
        String[] userInputArr = userInput.split(" ");
        Stack<Integer> stos = new Stack<>();

        int działanie = 0;

        for (String s : userInputArr) {
            try {
                int element = Integer.parseInt(s); //jeżeli udał się sparsować czyli nie poleciał wyjątek to wrzucamy na stos
                stos.push(element);
            } catch (Exception e){ //jeżeli poleciał wyjątek to oznacza, że nie dostaliśmy liczby na wejście
                switch (s) { //w zależności od operatorów wykonujemy dane działanie
                    case "*":
                        działanie = stos.pop() * stos.pop();
                        stos.push(działanie);
                        break;
                    case "/":
                        działanie = stos.pop() / stos.pop();
                        stos.push(działanie);
                        break;
                    case "+":
                        działanie = stos.pop() + stos.pop();
                        stos.push(działanie);
                        break;
                    case "-":
                        działanie = stos.pop() - stos.pop();
                        stos.push(działanie);
                        break;
                    default:
                }
            }

        }

        System.out.println(stos.pop());
    }
}
