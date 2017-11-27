package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {

    @Test
    public void testIterative(){
        Problem2 test=new Problem2();
        int n = 150;
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = (test.iterative(n));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRecursive(){
        Problem2 test=new Problem2();
        int n = 150;
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = (test.recursive(n, "", 1, 0));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRefRecursive(){
        Problem2 test=new Problem2();
        int n = 150;
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = (test.refRecursive(n));
        Assert.assertEquals(expected, actual);
    }

}
