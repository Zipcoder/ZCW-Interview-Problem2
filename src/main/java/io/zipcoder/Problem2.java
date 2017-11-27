package io.zipcoder;

public class Problem2 {

    public String fibonacciIteration(int n) {
        StringBuilder builder = new StringBuilder();


        if (n <= 1) {
            builder.append(n);
        }
        int current = 1;
        int prev = 1;


        for (int i = 2; i < n; i++) {
            int temp = current;
            builder.append(prev);
            current = prev;
            prev = temp;

            builder.append(", ");

            //doesnt work, just adds a bunch of 1's
        }

        return builder.toString();
    }


}
