package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Problem2Test {

    Problem2 test;

    @Before
    public void setUp(){
       test  = new Problem2();
    }

    @Test
    public void fibbonaciTest(){
        String fibbonaci = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = test.fibbonaciIteration(150);

        Assert.assertEquals(fibbonaci, actual);
    }
    @Test
    public void fibbonaciTest2(){
        String fib = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393";
        String actual = test.fibbonaciIteration(150000);
        Assert.assertEquals(fib, actual);
    }
    @Test
    public void fibRecursionTest(){
        String fibbonaci = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        List<Integer> fibList = new ArrayList<Integer>();
        String actual = test.fibRecursion(150, fibList);
        Assert.assertEquals(fibbonaci, actual);
    }
}
