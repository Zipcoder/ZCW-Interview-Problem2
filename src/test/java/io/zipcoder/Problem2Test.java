package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem2Test {

    private Problem2 problem;

    @Before
    public void setUp(){
        problem = new Problem2();
    }

    @Test
    public void fibonacciIterationTest() {
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = problem.fibonacciIteration(150);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciRecursionTest(){
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = problem.fibonacciRecursion(150);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciInputZeroTest(){
        String expected = "0";
        String actual = problem.fibonacciIteration(0);
        Assert.assertEquals(expected,actual);
    }

}
