package io.zipcoder;

public class Problem2 {

    public String fibonnaciToN(Integer n) {

        String output = "0, 1, ";
        int x = 0, y = 1, z = 1;
        for (int i = 0; z < n-1; i++) {
            x = y;
            y = z;
            output += z +", ";
            z = x + y;


        }
        return output.substring(0, output.length()-2);
        }


    public String fibonnaciToNRecursive(Integer n) {

        Integer i = 1;

        while(i<n) {
            fibonnaciToNRecursive(i + 1);

        }

        return i;
    }
}

