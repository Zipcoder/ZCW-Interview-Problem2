package io.zipcoder;

public class Problem2 {

    public static void main(String args[]) {
        fibonacciLoop(10);
    }

    private static void fibonacciLoop(int number) {

        for (int i = 1; i <= number; i++) {

            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
