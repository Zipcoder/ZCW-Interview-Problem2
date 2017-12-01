package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Problem2 {

    public String fibonacciIteration(int n){
        int currentInt = 0;
        LinkedList<Integer> integers = new LinkedList<Integer>();
        integers.add(0);
        integers.add(1);
        StringBuilder sb = new StringBuilder();
        sb.append("0, 1");
        for(int i = 2; integers.get(i-1)+integers.get(i-2) < n; i++){
            currentInt = integers.get(i-1)+integers.get(i-2);
            integers.add(currentInt);
            sb.append(", "+currentInt);
        }
        return sb.toString();
    }

    public ArrayList<Integer> fibonacciRecursion(int max){
        ArrayList<Integer> fibs = new ArrayList<Integer>();
        fibs.add(0);
        fibs.add(1);
        return fibonacciRecursion(fibs, max);
    }

    private ArrayList<Integer> fibonacciRecursion(ArrayList<Integer> fibs, int max){
        int nextFib = fibs.get(fibs.size()-1) + fibs.get(fibs.size() - 2);
        if(nextFib > max){
            return fibs;
        }
        fibs.add(nextFib);
        return fibonacciRecursion(fibs, max);
    }

    public String printFibonacciRecursion(ArrayList<Integer> fibs){
        if(fibs.size() == 1){
            return "" + fibs.get(0);
        } else {
            String output = fibs.get(0) + ", ";
            fibs.remove(0);
            return output + printFibonacciRecursion(fibs);
        }
    }

}
