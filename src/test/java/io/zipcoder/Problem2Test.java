package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem2Test {

    private Problem2 problem2;
    private int number;

    @Before
    public void setUp() {
        number = 150;
        problem2 = new Problem2();

    }
    @Test
    public void fibonacciIterationTest(){
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = problem2.fibonacciIteration(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibItArrayListTest(){
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = problem2.fibonacciIterationArrayList(number);
        Assert.assertEquals(expected, actual);

    }
}
