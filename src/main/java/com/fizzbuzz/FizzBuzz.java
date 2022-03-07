package com.fizzbuzz;

public class FizzBuzz {
   


    public static String getResult (int i) {
        if (i % 3 == 0 && i % 5 == 0 ) return "FizzBuzz";
        else if (i % 3 == 0) return "Fizz";
        else if (i % 5 == 0) return "Buzz";
        return Integer.toString(i);
    } 
    {
       
    }
}
