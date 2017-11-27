package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem2Test {

    Problem2 prob;

    @Before
    public void setup() {
        prob = new Problem2();
    }

    @Test
    public void fibonacciIteration() throws Exception {

        int n = 20;

        String expected = "1, 1, 2, 3, 5, 8, 13";
        String actual = prob.fibonacciIteration(n);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciRecursion() throws Exception {

        int n = 25;

        String expected = "1, 1, 2, 3, 5, 8, 13, 21";
        String actual = prob.fibonacciIteration(n);

        Assert.assertEquals(expected, actual);
    }
}
