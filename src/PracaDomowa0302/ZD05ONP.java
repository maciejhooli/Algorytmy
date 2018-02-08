package PracaDomowa0302;

import java.util.HashMap;
import java.util.Stack;

public class ZD05ONP {

    public static HashMap<Integer, Character> hashMap = new HashMap<Integer, Character>();
    public static Stack<Character> st = new Stack<>();


    private static void fillDictionary() {
        hashMap.put(1, '*');
        hashMap.put(2, '/');
        hashMap.put(3, '+');
        hashMap.put(4, '-');
        hashMap.put(5, '^');
        hashMap.put(6, '(');
        hashMap.put(7, ')');
        hashMap.put(8, '=');

    }

    public static void main(String[] args) {
        String userInput = "((2+7)/3+(14-3)*4)/2=";
        StringBuilder sb = new StringBuilder();
        fillDictionary();

        for (int i = 0; i < userInput.length(); i++) {
            switch (userInput.charAt(i)) {
                case '*':
                    onpMultiplication(userInput.charAt(i), sb);
                    break;
                case '/':
                    onpMultiplication(userInput.charAt(i), sb);
                    break;
                case '+':
                    onpAdd(userInput.charAt(i), sb);
                    break;
                case '-':
                    onpAdd(userInput.charAt(i), sb);
                    break;
                case '^':
                    onpMultiplication(userInput.charAt(i), sb);
                    break;

                case '(':
                    st.push(userInput.charAt(i));
                    break;
                case ')':
                    for (int j = 0; j < st.size(); j++) {
                        if (st.peek() == hashMap.get(6)) {
                            st.pop();
                            break;
                        } else {
                            sb.append(st.peek());
                            st.pop();
                        }
                    }
                    break;
                case '=':
                    sb.append(st.peek());
                    st.pop();
                    break;

                default:
                    sb.append(userInput.charAt(i));

            }
        }
        System.out.println(userInput);
        System.out.println(sb.toString());

    }


    public static StringBuilder onpMultiplication(char ch, StringBuilder sb) {
        if (st.empty()) {
            st.push(ch);
        } else if (st.peek() == hashMap.get(1)
                || st.peek() == hashMap.get(2)
                || st.peek() == hashMap.get(3)
                || st.peek() == hashMap.get(4)) {
            st.push(ch);
        } else {
            st.push(ch);
        }
        return sb;
    }

    public static StringBuilder onpAdd(char ch, StringBuilder sb) {
        if (st.empty()) {
            st.push(ch);
        } else if (st.peek() == hashMap.get(1)
                || st.peek() == hashMap.get(2)
                || st.peek() == hashMap.get(3)
                || st.peek() == hashMap.get(4)) {
            sb.append(st.peek());
            st.pop();
            st.push(ch);
        } else {
            st.push(ch);
        }
        return sb;
    }
}

// Działanie:           (2+3)*5=
// Wynik spodziewnay:   2 3 + 5 *
// Wynik otrzymany:     23+5*

// Działanie:           ((2+7)/3+(14-3)*4)/2=
// Wynik spodziewany:   2 7 + 3 / 14 3 - 4 * + 2 /
// Wynik otrzymany:     27+3/143-4*+2/

// Działanie:           ( a + b * c - d ) / ( e + f ) =
// Wynik spodziewany:   a b c * d - + e f + /
// Wynik:                a  b  c * d -+   e  f + /

// Działanie:           ((a+t)*((b+(a+c))^(c+d)))=
// Wynik spodziewany:   at+bac++cd+^*
// Wynik otrzymany:     at+bac++cd+^*( //Dlaczego jest ostatni nawias nie udało mi się wyjaśnić ale tylko pośrednio,
//                                          nie starczyło czasu na większą i bardziej czasochłonną analizę.

// znaki operatorów: '+', '-', '*', '/', '^'
// znaki nawiasów: '(', ')', '='
