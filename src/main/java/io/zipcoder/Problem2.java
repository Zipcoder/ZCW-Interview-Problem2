package io.zipcoder;

import java.util.StringTokenizer;

//complies, but test is not passing....

public class Problem2 {

    int numPrevious = 0;
    int numPrePrevious = 1;
    StringBuilder fibonacciString = new StringBuilder();

    //fibonacciIteration
    public String fibonacciIteration(int n) {
        if (n == 0) {
            fibonacciString.append("0");
        }
        else if (n == 1) {
            fibonacciString.append("0 1");
        }
        else {
            for (int i = 1; i < n; i++) {
                int nextNumber = numPrevious + numPrePrevious;
                fibonacciString.append(nextNumber + " ");
                numPrevious = numPrePrevious;
                numPrePrevious = nextNumber;
            }
        }
        return fibonacciString.toString();
    }

    
    public String fibonacciRecursion(int n) {

    }

}