package Testowanie.FizzBuzz;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class FizzBuzzSpec {

    FizzBuzz fizzBuzz;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public final void before() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void whenOverRangeThenRuntimeException(){
        exception.expect(RuntimeException.class);
        fizzBuzz.showResult(101);
    }

    @Test
    public void whenUnderRangeThenRuntimeException(){
        exception.expect(RuntimeException.class);
        fizzBuzz.showResult(-4);
    }

    @Test
    public void whenInRangePrintNumber(){
        fizzBuzz.showResult(10);
        assertEquals("10", Integer.toString(10));

    }

    @Test
    public void isTrueIfNumberIsDivisibleByThree(){
        assertEquals(Boolean.TRUE, fizzBuzz.isDivisibleByThree(9));
    }

    @Test
    public void isFalseIfNumberIsNotDivisibleByThree(){
        assertEquals(Boolean.FALSE, fizzBuzz.isDivisibleByThree(5));
    }

    @Test
    public void isTrueIfNumberIsDivisibleByFive(){
        assertEquals(Boolean.TRUE, fizzBuzz.isDivisibleByFive(10));
    }

    @Test
    public void isFalseIfNumberIsNotDivisibleByFive(){
        assertEquals(Boolean.FALSE, fizzBuzz.isDivisibleByFive(6));
    }

    @Test
    public void isTrueIfNumberIsDivisibleByThreeAndFive(){
        assertEquals(Boolean.TRUE, fizzBuzz.isDivisibleByFive(15));
    }

    @Test
    public void isFizzWhenDivisableByThree(){
        assertEquals("FIZZ", fizzBuzz.showResult(6));
    }

    @Test
    public void isBuzzWhenDivisableByFive(){
        assertEquals("BUZZ", fizzBuzz.showResult(10));
    }

    @Test
    public void isFizzBuzzWhenDivisableByThreeAndFive(){
        assertEquals("FIZZBUZZ", fizzBuzz.showResult(15));
    }

}
