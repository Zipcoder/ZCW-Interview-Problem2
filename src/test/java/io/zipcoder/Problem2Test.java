package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Problem2Test {

    private Problem2 tester;

    @Before
    public void setup() {
        tester = new Problem2();
    }

    @Test
    public void fibIterationTest1() {
        int input = 150;
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = tester.fibIteration(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibRecursionTest1() {
        int input = 150;
        ArrayList<Integer> testList = new ArrayList<Integer>();
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = tester.fibRecursion(input, testList);
        Assert.assertEquals(expected, actual);
    }

}
