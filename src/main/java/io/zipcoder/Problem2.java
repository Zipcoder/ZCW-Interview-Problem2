package io.zipcoder;

public class Problem2 {

    public String fibonacciIteration(Integer n) {
        StringBuilder output = new StringBuilder("0");
        Integer previousFibNumber = 0;
        Integer currentFibNumber = 1;

        while (currentFibNumber < n) {
            output.append(", ").append(currentFibNumber);

            Integer previousTemp = currentFibNumber;

            currentFibNumber = currentFibNumber + previousFibNumber;
            previousFibNumber = previousTemp;

        }

        return output.toString();
    }

    public Integer fibonacciRecursionInt(Integer n, Integer currentFibNumber) {
        if (currentFibNumber < n) {
            if (currentFibNumber == 0) {
                return 0;
            }
            else if (currentFibNumber == 1) {
                return 1;
            }
            else {
                return fibonacciRecursionInt(n, currentFibNumber+1) +
                        fibonacciRecursionInt(n, currentFibNumber+2);
            }
        }
        else {
            return fibonacciRecursionInt(n, currentFibNumber);
        }
    }
}
