package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {

    @Test
    public void withLoopTest(){
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        Problem2 problem2 = new Problem2(150);
        String actual = problem2.withLoop();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void withRecursionTest(){
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        Problem2 problem2 = new Problem2(150);
        String actual = problem2.withRecursion();
        Assert.assertEquals(expected,actual);
    }
}
