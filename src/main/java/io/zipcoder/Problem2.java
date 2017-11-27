package io.zipcoder;

public class Problem2 {
//I couldn't gert the math right :-(
    public String fibonacciIteration(int value) {
        int first = 0, next = 1, result = 0;
        String toReturn = "0 ";
        do {
            first = result;
            result = first + next;
            toReturn += result + " ";
            next = result;

        } while (result != value);
        return toReturn;
    }
//Should have gotten started on this one ;-(
    public String fibonacciRecursion(int value) {
        return null;
    }
}

//double prev=0d, next=1d, result=0d;
//    for (int i = 0; i < n; i++) {
//        result=prev+next;
//        prev=next;
//        next=result;
//        }
//        return result;

//    int f = 0;
//    int g = 1;
//
//    for (int i = 1; i <= 10; i++) {
//            System.out.print(f + " ");
//            f = f + g;
//            g = f - g;
//            }