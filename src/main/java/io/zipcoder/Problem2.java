package io.zipcoder;

import java.util.ArrayList;

public class Problem2 {
//    public static int fib(int n) {
//        if (n <= 1) return n;
//        return fib(n - 1) + fib(n - 2);
//    }
ArrayList<Integer> list = new ArrayList<>(13);
    public String fibonaccilIteration(int n) {

        list.add(0);
        list.add(1);
        if (list.size() - 1 < n) {
            for (int i = 0; i < list.size(); i++) {
                list.add(i + 2, list.get(i) + list.get(i + 1));
            }
        }
        System.out.println(list);
        return list.toString();
    }
}
