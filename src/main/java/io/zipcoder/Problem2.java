package io.zipcoder;

public class Problem2 {

    public String fibonacciIteration(int n) {
        int nsub1 = 0;
        int fibVal = 1;
        StringBuilder output = new StringBuilder();
        output.append(1);
        while(fibVal + nsub1 < n) {
            fibVal += nsub1;
            output.append(", " + fibVal);
            nsub1 = fibVal - nsub1;
        }
        return output.toString();
    }

    public String fibonacciRecursion(int n) {
        return null;
    }

}
