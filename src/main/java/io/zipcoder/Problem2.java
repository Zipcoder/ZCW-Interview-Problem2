package io.zipcoder;

import java.util.ArrayList;

public class Problem2 {

    public String fibon(int n) {
        ArrayList <Integer> arrayList = new ArrayList <Integer>();
        arrayList.add(0);
        arrayList.add(1);

        Integer lowerIndex = 0;
        Integer higherIndex = 1;
        Integer nextInt;

        do {
            nextInt = arrayList.get(lowerIndex) + arrayList.get(higherIndex);
            if (nextInt > n) {
                break;
            }
            arrayList.add(nextInt);
            lowerIndex++;
            higherIndex++;
        } while (true);

        return arrayList.toString();

    }

}
