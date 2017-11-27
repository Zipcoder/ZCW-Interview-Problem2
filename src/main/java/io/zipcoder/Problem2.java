package io.zipcoder;

import java.util.Scanner;

public class Problem2 {
    public static void main(String args[])
    {
        Problem2 problem2 = new Problem2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(fibonacciIteration(n));
        System.out.println(problem2.fibonacciRecursion(n));
    }
    public static String fibonacciIteration(int n){
        int n1=0,n2=1,n3;
        String str = "0, 1 , 1";
        for(int i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            str+=", "+n3;
            n1=n2;
            n2=n3;
        }
        return str;
    }
    int n1 = 0,n2= 1,n3;
    public  String fibonacciRecursion(int n){

        String str = "0, 1, 1";
        if(n>=0){
            n3 = n1 + n2;
            str+=", "+n3;
            n1 = n2;
            n2 = n3;


            fibonacciRecursion(n-1);
        }
        return str;
    }
}
