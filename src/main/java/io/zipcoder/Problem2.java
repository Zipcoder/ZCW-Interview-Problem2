package io.zipcoder;

public class Problem2 {


    public static int fibonacciIteration(int n) {

        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static int fibonacciRecursion(int n) {


        if(n <= 1) {
            return n;
        }
        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);

    }
}
