package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {

    @Test
    public void fibonacciIterationTest150() {
        Problem2 problem2 = new Problem2();
        int n = 150;

        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = problem2.fibonacciIteration(n);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciIterationTest15() {
        Problem2 problem2 = new Problem2();
        int n = 15;

        String expected = "0, 1, 1, 2, 3, 5, 8, 13";
        String actual = problem2.fibonacciIteration(n);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciRecursionTest150() {
        Problem2 problem2 = new Problem2();
        int n = 150;

        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = problem2.fibonacciRecursion(n);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciRecursionTest15() {
        Problem2 problem2 = new Problem2();
        int n = 15;

        String expected = "0, 1, 1, 2, 3, 5, 8, 13";
        String actual = problem2.fibonacciRecursion(n);

        Assert.assertEquals(expected, actual);
    }
}
