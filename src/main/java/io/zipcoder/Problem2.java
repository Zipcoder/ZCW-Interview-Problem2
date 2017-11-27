package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;

public class Problem2 {

    public String fibonacci(int n) {

        ArrayList<Integer> fib = new ArrayList<Integer>();
        fib.add(0);
        fib.add(1);
        int i = 1;
        while (fib.get(i) < n) {
            if (fib.get(i - 1) + fib.get(i) > n)
                break;
            else fib.add(fib.get(i - 1) + fib.get(i));
            i++;
        }
        String result = fib.get(0) + "";
        for (int j = 1; j < fib.size(); j++)
            result += ", " + fib.get(j);

        return result;
    }

    public String getRecursive(int n) {
        String result = "0, ";

        result += fib2(0, 1, n);
        return result;
    }

    public String fib2(int prev, int current, int n) {
        if (current + prev < n)
            return current + ", " + fib2(current, current + prev, n);

        return "" + current;
    }

}
