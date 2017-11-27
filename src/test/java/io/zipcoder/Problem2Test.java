package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {

    Problem2 problem2 = new Problem2();

    @Test
    public void fibonacciIterationTest(){
        String expected = "";

        String actual = problem2.fibonacciIteration(15);

        Assert.assertEquals(expected, actual);
    }
}
