package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem2Test {

    @Test
    public void testFibonacciIterative(){

        Problem2 problem2 = new Problem2();

        Integer n = 150;
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = problem2.fibonnaciToN(150);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFibonacciRecursive(){

        Problem2 problem2 = new Problem2();

        Integer n = 150;
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = problem2.fibonnaciToNRecursive(150);

        Assert.assertEquals(expected,actual);
    }
}
