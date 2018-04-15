package io.zipcoder;

import java.util.ArrayList;

public class Problem2 {
    public String fibonacciIteration(int n) {

        ArrayList<Integer> fibNums = new ArrayList<Integer>();
        int firstNum = 0;
        int secondNum = 1;

        while (true) {
            if (firstNum < n) {
                fibNums.add(firstNum);
                firstNum += secondNum;
                secondNum = firstNum - secondNum;
            } else {
                break;
            }
        }
        return fibNums.toString().replace("[", "").replace("]", "");
    }
//    public String fibonacciRecursion(int n) {
//    }
}



