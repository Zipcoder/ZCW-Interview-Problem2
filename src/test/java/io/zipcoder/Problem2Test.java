package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class Problem2Test {

    Problem2 problem2 = new Problem2();

    @Test
    public void iterationMethodTest() throws Exception {
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = problem2.iterationMethod(150);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void recursionMethodTest() throws Exception {
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = problem2.recursionMethod(150);
        Assert.assertEquals(expected,actual);
    }
}
