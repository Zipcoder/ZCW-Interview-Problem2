package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {

    String sequence = "";
    ArrayList<Integer> fibbonaciS = new ArrayList<Integer>();
    static List<Integer> fibList;

    public Problem2(){
        fibbonaciS.add(0);
        fibbonaciS.add(1);
    }

    public String fibbonaciIteration(int n){
        String sequence = "";
        int endNumber = 1;

        while(endNumber < n){
            int twoBeforeEnd = fibbonaciS.get(fibbonaciS.size() - 2);
            int oneBeforeEnd = fibbonaciS.get(fibbonaciS.size() - 1);
            endNumber = twoBeforeEnd + oneBeforeEnd;
            fibbonaciS.add(endNumber);
        }
        for(int j = 0; j < fibbonaciS.size()-1; j++){
            sequence += fibbonaciS.get(j) + ", ";
        }
        return sequence.substring(0, sequence.length()-2);
    }
    //currentIndex = (CurrentIndex - 1) + (currentIndex - 2)

    public String fibRecursion(int n, List<Integer> fibList){
        if(fibList.size() == 0){
            fibList.add(0);
            fibList.add(1);
        }
        int endNum = fibList.get(fibList.size()-1) + fibList.get(fibList.size()-2);
        if (endNum > n){
            String sequence1 = "";
            for (int i = 0; i < fibList.size();i++) {

                sequence1 += fibList.get(i) + ", ";
            }
            return sequence1.substring(0, sequence1.length()-2);

        }
        else{
          fibList.add(endNum);
          return fibRecursion(n, fibList);
        }


    }
}
