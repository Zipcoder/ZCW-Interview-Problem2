package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem2Test {

    Problem2 problem2 = new Problem2();
    int number = 150;


    @Test
    public void fibonacciIterationTest(){
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = problem2.fibonacciIteration(number);
        Assert.assertEquals(expected, actual);
    }
}
