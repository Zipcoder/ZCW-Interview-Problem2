package io.zipcoder;

public class Problem2 {

    public static void main(String args[]) {

        Problem2 problem2 = new Problem2();

         problem2.fibonacciLoop(10);


    }

    public void fibonacciLoop(int number) {

        for (int i = 1; i <= number; i++) {

            System.out.print(fibonacci(i) + " ");
        }
    }

    public int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);

    }

}



