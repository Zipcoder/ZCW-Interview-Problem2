package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {
    Problem2 test = new Problem2();

    @Test
    public void fibonacciIterationTest(){
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";

        String actual = test.fibon(150);

        Assert.assertEquals(expected,actual);
    }


}
