package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {

    @Test
    public void fibonacciIterationTest(){
        Problem2 problem2 = new Problem2();

        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = problem2.fibonacciIteration(150);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void printFibonacciRecursionTest(){
        Problem2 problem2 = new Problem2();

        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = problem2.printFibonacciRecursion(problem2.fibonacciRecursion(150));

        Assert.assertEquals(expected, actual);
    }


}
