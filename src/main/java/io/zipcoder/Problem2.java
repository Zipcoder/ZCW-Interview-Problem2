package io.zipcoder;

import java.util.ArrayList;

public class Problem2 {
    ArrayList<Integer> lisOfIntegers = new ArrayList<Integer>();
    StringBuilder numberSequence = new StringBuilder();

    public String fibonacciIteration(int number){

        int[] fibonacciSeries = new int[number];
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;
        numberSequence.append(fibonacciSeries[0]);
        //numberSequence.append(", "+ fibonacciSeries[1]);

        for (int i = 2; number > fibonacciSeries[i - 1]; i++){
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries [i - 2];
            numberSequence.append(", " + fibonacciSeries[i - 1]);

        }

        return numberSequence.toString();
    }//works, but not efficient

    public String fibonacciIterationArrayList(int number){
        //lisOfIntegers.add(0);
        //lisOfIntegers.add(1);
        for (int x = 0; x < number; x++){
            lisOfIntegers.add(x);
        }
        numberSequence.append(lisOfIntegers.get(0));
        numberSequence.append(", " + lisOfIntegers.get(1));
        int previousIndex = 0;
        int currentIndex = 1;
        int fibNumber;

        for (int i = 0; currentIndex < lisOfIntegers.size()- previousIndex ; i++){
            fibNumber = previousIndex + currentIndex;
            numberSequence.append(", " + fibNumber);
            previousIndex = currentIndex;
            currentIndex = fibNumber;

        }
        return numberSequence.toString();
    }

}
