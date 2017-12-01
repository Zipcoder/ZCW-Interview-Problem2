package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {

    Problem2 problem2 = new Problem2();
    @Test
    public void fiboonacciTest(){
       problem2.fibonacci(3);
       int expected = 2;
        Assert.assertEquals(expected, problem2.fibonacci(3));
    }
    @Test
    public void fiboonacciLoopTest(){
        problem2.fibonacciLoop(3);
        int expected = 2;
        Assert.assertEquals(expected, problem2.fibonacci(3));

    }





}
