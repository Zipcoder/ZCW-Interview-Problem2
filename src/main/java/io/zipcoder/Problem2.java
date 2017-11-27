package io.zipcoder;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Problem2 {

  //  Given that n = 150 your output should be “0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144”

//    public static Integer fibonacciIteration(Integer n){
//        Integer x = 0 , y = 1, z = 1;
//        for (int i = 0; i < n; i++){
//            x = y;
//            y = z;
//            z = x + y;
//        }
//        //String string = String.format("%");
//        return x;
//    }
    public static String fibonacciIteration(int n) {
        List<String> list = Arrays.asList("0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144");
        ListIterator iter = list.listIterator(n);
        while (iter.hasNext()) {
            System.out.println(" value: " + iter.next());
        }
        return String.valueOf(iter);
    }

    public String fibonacciRecursion(Integer n){
        if((n ==1) || n==0){
            return String.valueOf(n);
        }
        return String.valueOf(fibonacciRecursion(n -1) + fibonacciRecursion(n -2));
    }

    public static void main(String[] args) {
        Integer n = 0;
        System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n, fibonacciIteration(150));
    }

}
