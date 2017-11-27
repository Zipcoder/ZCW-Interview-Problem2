package io.zipcoder;

import java.util.ArrayList;

public class Problem2 {

    public String fibonacciIteration(Integer n) {
        ArrayList<Integer> fibSequence = new ArrayList<>();
        fibSequence.add(0);
        fibSequence.add(1);
        Integer lowerIndex = 0;
        Integer higherIndex = 1;
        Integer nextFibNumber;

        do {
            nextFibNumber = fibSequence.get(lowerIndex) + fibSequence.get(higherIndex);
            if (nextFibNumber > n) {
                break;
            }
            fibSequence.add(nextFibNumber);
            lowerIndex++;
            higherIndex++;

        } while(true);

        return fibSequence.toString();
    }

    public String fibonacciRecursion(Integer n) {
        ArrayList<Integer> newFibSequence = new ArrayList<>();
        newFibSequence.add(0);
        newFibSequence.add(1);

        Integer sizeOfList = newFibSequence.size();
        Integer nextFibNumber = newFibSequence.get(sizeOfList - 2) + newFibSequence.get(sizeOfList - 1);


        newFibSequence.add(nextFibNumber);


        return newFibSequence.toString();
    }
}
