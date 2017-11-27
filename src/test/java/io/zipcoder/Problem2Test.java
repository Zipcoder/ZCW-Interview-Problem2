package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {

    Problem2 prob2 = new Problem2();
    int n = 7;

    @Test
    public void fibonnaciRecursionTest(){
        int expected = 13;
        int actual = prob2.fibonacci(n);
        Assert.assertEquals(expected, actual);
        System.out.println(prob2.fibonacci(n));
    }

    @Test
    public void fibonnaciLoopTest(){
        int expected = 13;
        int actual = prob2.fibonacci2(n);
        Assert.assertEquals(expected, actual);
        System.out.println(prob2.fibonacci2(n));
    }
}
