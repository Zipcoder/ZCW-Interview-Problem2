package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {
    Problem2 problem2 = new Problem2();
    @Test
    public void testFibonaccilIteration(){
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = problem2.fibonaccilIteration(150);
        Assert.assertEquals(expected,actual);
    }

}
