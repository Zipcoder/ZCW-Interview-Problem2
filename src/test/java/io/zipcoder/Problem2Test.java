package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.zipcoder.Problem2.fibRecursion;
import static io.zipcoder.Problem2.fibSequence;

public class Problem2Test {

    @Test
    public void fibTest() {
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = fibSequence(150);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibRecursionTest() {
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        List<Integer> list = new ArrayList<>();
        String actual = fibRecursion(150, list);

        Assert.assertEquals(expected, actual);
    }
}
