package io.zipcoder;

import java.util.LinkedList;

public class Problem2 {

    public String fibonacciIteration(int n){
        int currentInt = 0;
        LinkedList<Integer> integers = new LinkedList<Integer>();
        integers.add(0);
        integers.add(1);
        StringBuilder sb = new StringBuilder();
        sb.append("0, 1");
        int index = 2;
        while(true){
            currentInt = integers.get(index-1)+integers.get(index-2);
            integers.add(currentInt);
            if(currentInt > n){
                break;
            }
            sb.append(", "+currentInt);
            index++;
        }
        return sb.toString();
    }


    // Don't work
    // much easier to work with ints for recursion
    /*public int fibonacciRecursion(int n){

        if()
        sb.append(fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2));
        return null;
    }

    public String printFibonacciRecursion(int[] array){
        StringBuilder sb = new StringBuilder();
        for(int i: array){
            if(i < array.length-1) {
                sb.append(i + ", ");
            } else {
                sb.append(i);
            }
        }
        return sb.toString();
    }*/


}
