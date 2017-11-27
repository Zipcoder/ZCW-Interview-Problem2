package io.zipcoder;

import java.util.ArrayList;

public class Problem2 {

    //Given that n = 150 your output should be “0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144”

    public  ArrayList<Integer> createAnArrayOfNumber(int n){

        ArrayList<Integer> input = new ArrayList<Integer>();

        for(int i =0; i < n+1; i++){
            input.add(i);
        }
    return  input;

    }

    public ArrayList<Integer> returnSumOfTwoPreceedingNumbersInList(int n){
        ArrayList<Integer> sumOfTwoNumbers= new ArrayList<Integer>();
        ArrayList<Integer> input = createAnArrayOfNumber(n);

        for (int i=2; i<input.size(); i++ ) {

            sumOfTwoNumbers.add(createAnArrayOfNumber(n).get(i - 1) + createAnArrayOfNumber(n).get(i - 2));
        }
        return sumOfTwoNumbers;

    }

}
