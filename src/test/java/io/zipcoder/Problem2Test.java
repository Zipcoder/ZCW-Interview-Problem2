package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {

    Problem2 problem2=new Problem2();

    @Test
    public void fibonacciTest(){
        String expected="0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual=problem2.fibonacci(150);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fib2Test(){
        String expected="1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual=problem2.fib2(0,1,150);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getRecursiveTest(){
        String expected="0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual=problem2.getRecursive(150);

        Assert.assertEquals(expected, actual);
    }
}
