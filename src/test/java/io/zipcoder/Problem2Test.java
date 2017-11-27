package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {

    Problem2 prob2 = new Problem2();
    int n = 150;

    @Test
    public void fibonnaciRecursionTest(){
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = prob2.fibonacci(n);
        Assert.assertEquals(expected, actual);
        System.out.println(prob2.fibonacci(n));
    }

    @Test
    public void fibonnaciLoopTest(){
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = prob2.fibonacci2(n);
        Assert.assertEquals(expected, actual);
        System.out.println(prob2.fibonacci2(n));
    }
}
