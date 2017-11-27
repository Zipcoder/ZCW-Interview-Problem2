package io.zipcoder;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Problem2 {

    ArrayList<Integer> fibonacciSequence = new ArrayList<Integer>();

    public Problem2() {
        fibonacciSequence.add(0);
        fibonacciSequence.add(1);
    }

    public String fibonacciIteration(int n) {
        if(n == 0) {
            return "0";
        }
        else {
            int lastNum = 1;
            while (lastNum < n) {
                int twoBefore = fibonacciSequence.get(fibonacciSequence.size() - 2);
                int oneBefore = fibonacciSequence.get(fibonacciSequence.size() - 1);
                lastNum = twoBefore + oneBefore;
                if(lastNum < n) {
                    fibonacciSequence.add(lastNum);
                }
            }
        }
        return arrayListToString(fibonacciSequence);
    }

    public String fibonacciRecursion(int n) {
        if(n == 0) {
            return "0";
        }
        else {
            return arrayListToString(recursionHelper(fibonacciSequence, n));
        }
    }

    public ArrayList<Integer> recursionHelper(ArrayList<Integer> currentSequence, int n) {
        int twoBefore = currentSequence.get(currentSequence.size() - 2);
        int oneBefore = currentSequence.get(currentSequence.size() - 1);
        if(twoBefore + oneBefore < n) {
            currentSequence.add(twoBefore + oneBefore);
            recursionHelper(currentSequence, n);
        }
        return currentSequence;
    }

    public String arrayListToString(ArrayList<Integer> numbers) {
        StringJoiner stringJoiner = new StringJoiner(", ");
        for(Integer number : numbers) {
            stringJoiner.add(number.toString());
        }
        return stringJoiner.toString();
    }
}
