package io.zipcoder;

public class Problem2 {
    StringBuilder numberSequence = new StringBuilder();

    public String fibonacciIteration(int number){

        int[] fibonacciSeries = new int[number];
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;

        for (int i = 2; i < number; i++){
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries [i - 2];
            numberSequence.append(i);

        }

        return numberSequence.toString();
    }//none of this works
}
