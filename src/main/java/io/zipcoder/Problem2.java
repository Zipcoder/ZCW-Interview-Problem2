package io.zipcoder;

import java.util.ArrayList;

public class Problem2 {

//    public String fibonacciIteration(int n) {
//        StringBuilder builder = new StringBuilder();
//        int current = 1;
//        int prev = 1;
//
//        if (n <= 1) {
//            builder.append(n);
//        }
//        for (int i = 2; i < n; i++) {
//            int temp = current;
//            builder.append(prev);
//            current = prev;
//            prev = temp;
//
//            builder.append(", ");
//
//            //doesnt work, just adds a bunch of 1's
//        }
//
//        return builder.toString();
//    }
//

    public String fibon(int n) {
        ArrayList <Integer> arrayList = new ArrayList <Integer>();
        arrayList.add(0);
        arrayList.add(1);

        Integer lowerIndex = 0;
        Integer higherIndex = 1;
        Integer fib;

        do {
            fib = arrayList.get(lowerIndex) + arrayList.get(higherIndex);
            if (fib < n) {
                break;
            }
            arrayList.add(fib);
            lowerIndex++;
            higherIndex++;
        } while (true);

        return arrayList.toString();

    }

}
