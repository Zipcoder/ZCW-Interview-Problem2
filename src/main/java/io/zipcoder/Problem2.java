package io.zipcoder;


public class Problem2 {


    public static void main(String[] args) {
        System.out.println(fibonacci(50));
        System.out.println(fibonacci2(50));
    }


    public static Integer fibonacci(int number) {
        String fibonacci = " ";
        if (number == 1 || number == 2) {
            return 1;
        }
        Integer i = 0;
        while (number != 1 || number != 2) {
            i = fibonacci(number - 1) + fibonacci(number - 2);
        }
        return Integer.valueOf(i.toString());
    }


    public static String fibonacci2(int number) {

        if (number == 1 || number == 2) {
            return String.valueOf(1);
        }

        int fibo1 = 1, fibo2 = 1, fibonacci = 1;

        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.println(fibonacci);

        }

        return String.valueOf(fibonacci);

    }
}


