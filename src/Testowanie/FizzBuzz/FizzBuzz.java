package Testowanie.FizzBuzz;

public class FizzBuzz {

    public String showResult(int a) {
        if (a < 1 || a > 100) {
            throw new RuntimeException("Out of range");
        } else {
            if (isDivisibleByThreeAndFive(a)) {
                return "FIZZBUZZ";
            } else if (isDivisibleByFive(a)) {
                return "BUZZ";
            } else if (isDivisibleByThree(a)) {
                return "FIZZ";
            } else {
                return Integer.toString(a);
            }
        }
    }

    public boolean isDivisibleByThree(int a) {
        return (a % 3 == 0);
    }

    public boolean isDivisibleByFive(int a) {
        return (a % 5 == 0);
    }

    public boolean isDivisibleByThreeAndFive(int a) {
        return isDivisibleByThree(a) && isDivisibleByFive(a);
    }

}
