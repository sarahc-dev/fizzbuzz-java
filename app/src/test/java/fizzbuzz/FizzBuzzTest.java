package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testForNumber3ReturnsFizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzbuzz.forNumber(3));
    }

    @Test
    public void testForNumber5ReturnsBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzbuzz.forNumber(5));
    }

    @Test
    public void testForNumber15ReturnsFizzBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("FizzBuzz", fizzbuzz.forNumber(15));
    }

    @Test
    public void testForNumber2Returns2() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("2", fizzbuzz.forNumber(2));
    }

    @Test
    public void testForMultiple3ReturnsFizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzbuzz.forNumber(6));
        Assert.assertEquals("Fizz", fizzbuzz.forNumber(12));
        Assert.assertEquals("Fizz", fizzbuzz.forNumber(27));
    }

    @Test
    public void testForMultiple5ReturnsBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzbuzz.forNumber(10));
        Assert.assertEquals("Buzz", fizzbuzz.forNumber(20));
        Assert.assertEquals("Buzz", fizzbuzz.forNumber(100));
    }

    @Test
    public void testForMultiple15ReturnsFizzBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("FizzBuzz", fizzbuzz.forNumber(30));
        Assert.assertEquals("FizzBuzz", fizzbuzz.forNumber(60));
        Assert.assertEquals("FizzBuzz", fizzbuzz.forNumber(150));
    }

    @Test
    public void testForGenerateSequence3ReturnsCorrectString() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("1, 2, Fizz", fizzbuzz.generateSequence(3).toString());
    }

    @Test
    public void testForGenerateSequence15ReturnsCorrectString() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", fizzbuzz.generateSequence(15).toString());
    }
}
