package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {

    @Test
    public void fibonacciIterationTest() {
        Integer n = 150;

        Problem2 problem2 = new Problem2();

        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = problem2.fibonacciIteration(n);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void fibonacciRecursionTest() {
        Integer n = 150;

        Problem2 problem2 = new Problem2();
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";

        Integer currentFibNumber = 0;

        Integer actual = problem2.fibonacciRecursionInt(n, currentFibNumber);
        System.out.println(actual);
        //Assert.assertEquals(expected,actual);

    }
}
