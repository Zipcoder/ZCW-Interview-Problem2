package io.zipcoder;

import java.util.ArrayList;

public class Problem2 {

    private ArrayList<Integer> fibonacciSequence = new ArrayList<>();
    private Integer counter = 0;

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

    public void fibonacciRecursion(Integer n) {
        if (fibonacciSequence.size() == 0) {
            fibonacciSequence.add(0);
            fibonacciSequence.add(1);
        }
            Integer indexOfpreviousFibNumber = fibonacciSequence.size() - 2;
            Integer indexOfcurrentFibNumber = fibonacciSequence.size() - 1;
            Integer newFibNumber = fibonacciSequence.get(indexOfpreviousFibNumber) + fibonacciSequence.get(indexOfcurrentFibNumber);
            if (newFibNumber < n) {
                fibonacciSequence.add(newFibNumber);
                //System.out.println("We have recursed " + counter + " times");
                //counter++;
                fibonacciRecursion(n);

            }
        }

    public ArrayList<Integer> getFibonacciSequence() {
        return fibonacciSequence;
    }
}
