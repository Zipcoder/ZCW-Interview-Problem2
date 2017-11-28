package io.zipcoder;

public class Problem2 {

    public static void main(String args[]) {

        Problem2 problem2 = new Problem2();

        problem2.fibonacciLoop(10); // recursion
        System.out.println();
        problem2.fiboWithLoops(10);  // for loop

    }

    public void fibonacciLoop(int number) {

        for (int i = 2; i <= number; i++) {

            System.out.print(fibonacci(i) + " ");
        }
    }

    public int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);

    }

    public void fiboWithLoops(int a){
           int result = 0 ;
           int previousNum = 0;
           int nextNum = 1;

        for (int i = 0;i<a;i++ ){

            result = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = result;
            System.out.print(result + " ");
        }
    }

}



