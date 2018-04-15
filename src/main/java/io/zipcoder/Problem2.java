package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

    public static String fibSequence(Integer num) {

        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);

        for(int i = 1; i < num; i++) {
            if(fib.get(fib.size() - 2) + fib.get(fib.size() - 1) > num) {
                break;
            }
            Integer newNum = fib.get(fib.size() - 1) + fib.get(fib.size() - 2);
            fib.add(newNum);
            i = newNum;
        }

        StringBuilder sb = new StringBuilder();
        for(Integer key : fib) {
            sb.append(Integer.toString(key) + ", ");
        }
        return sb.toString().substring(0, sb.length() - 2);
    }

    public static String fibRecursion(Integer num, List<Integer> fib) {

        if(fib.size() == 0) {
            fib.add(0);
            fib.add(1);
        }

        if(fib.get(fib.size() - 2) + fib.get(fib.size() - 1) > num) {
            StringBuilder sb = new StringBuilder();
            for(Integer key : fib) {
                sb.append(Integer.toString(key) + ", ");
            }
            return sb.toString().substring(0, sb.length() - 2);
        }

        Integer newNum = fib.get(fib.size() - 1) + fib.get(fib.size() - 2);
        fib.add(newNum);

        return fibRecursion(num, fib);
    }
}
