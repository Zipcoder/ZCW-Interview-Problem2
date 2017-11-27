package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {

    @Test
    public void fibonacciIterationTest() {
        String actual = new Problem2().fibonacciIteration(150);
        String expected = "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144]";

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void fibonacciRecursionTest() {
        String actual = new Problem2().fibonacciRecursion(150);
        String expected = "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144]";

        Assert.assertEquals(expected, actual);


    }
}
