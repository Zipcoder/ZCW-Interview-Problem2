package io.zipcoder;

public class Problem2 {

    public String iterative(int n){
        String output = "0";
        int y=1;
        int temp;
        int x=0;

        while (y<n){
            output+=", "+y;
            temp=y;
            y=y+x;
            x=temp;
        }

        return output;
    }

    public String refRecursive(int n) {

    }

    public String recursive(int n, String building, int y, int x){//Works if passed 1 and 0 to y and x, respectively.
                                                            //Trying to optimize above
        if (y>n){
            return "0"+building;
        }
        return recursive(n, building+", "+y, y+x, y);
    }
}
