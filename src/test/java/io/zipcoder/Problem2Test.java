package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;


public class Problem2Test {

    @Test
    public void fibonacciIteration() {

        int expected = 6765;
        int actual = Problem2.fibonacciIteration(20);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciRecursion() {

        int expected = 75025;
        int actual = Problem2.fibonacciRecursion(25);

        Assert.assertEquals(expected, actual);

    }
}
