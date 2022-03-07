package com.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
   
    @Test
    public void divisibleByThree() 
    {
       Assert.assertEquals("Fizz", FizzBuzz.getResult(3));
    }
    @Test
    public void divisibleByFive() 
    {
       Assert.assertEquals("Buzz", FizzBuzz.getResult(5));
    }

    @Test
    public void divisibleByThreeAndFive() 
    {
       Assert.assertEquals("FizzBuzz", FizzBuzz.getResult(15));
    }


}
