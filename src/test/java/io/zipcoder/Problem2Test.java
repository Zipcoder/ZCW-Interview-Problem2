package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Problem2Test {
    Problem2 problem2 = new Problem2();

    @Test

    public void createAnArrayOfNumberTest(){

        problem2.createAnArrayOfNumber(10);

        int expected = 11;
        int actual =  problem2.createAnArrayOfNumber(10).size();

        Assert.assertEquals(expected, actual);
    }
    @Test
    //Given that n = 150 your output should be “0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144”

    public void sumOfTwoProceedingNumberTest(){
        ArrayList<Integer> sum =problem2.returnSumOfTwoPreceedingNumbersInList(150);


        int expected = 3;
        int actual =  sum.get(1);

        Assert.assertEquals(expected, actual);
    }
}
