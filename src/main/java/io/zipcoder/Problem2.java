package io.zipcoder;

public class Problem2 {

    public String iterationMethod(int n){
        if(n <= 1) {
            return String.valueOf(n);
        }
        int num = 1;
        int prevNum = 1;

        for(int i=2; i<n; i++) {
            int temp = num;
            num += prevNum;
            prevNum = temp;
        }
        return String.valueOf(num);
    }

    public String recursionMethod(int n){
        if(n == 0)
            return String.valueOf(0);
        else if(n == 1)
            return String.valueOf(1);
        else
            return recursionMethod(n - 1) + recursionMethod(n - 2);
    }
}
