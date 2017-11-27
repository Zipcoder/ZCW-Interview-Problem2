package io.zipcoder;

import java.util.Scanner;

public class Problem2 {

//    public static int fibonacciIteration(int n) {
//
//        if (n <= 1)
//            return n;
//        return fibonacciIteration(n - 1) + fibonacciIteration(n - 2);
//    }
//
//    public static void main(String args[]) {
//        int number = 9;
//        System.out.println(fibonacciRecusion(number));
//    }
//
//    public static int fibonacciRecusion(int number) {
//        if (number == 1 || number == 2) {
//            return 1;
//        }
//
//        return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2); // tail recursion
//    }


    //Just stubbing out logic. I am no were near where I want it to be

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
        fibonacciIteration(n);
        System.out.println(fibonacciRecursion(n));
    }

    public static void fibonacciIteration(int n) {
        if (n == 0) {
            System.out.println("0");
        } else if (n == 1) {
            System.out.println("0 1");
        } else {
            System.out.print("0 1 ");
            int a = 0;
            int b = 1;
            for (int i = 1; i < n; i++) {
                int nextNumber = a + b;
                System.out.println(nextNumber + " " + "iter");
                a = b;
                b = nextNumber;
            }
        }
    }



    public static int fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
    }
}


