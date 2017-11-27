package io.zipcoder;
import java.util.ArrayList;

public class Problem2 {
    int maxNum;
    public Problem2(int maxNum){
        this.maxNum = maxNum;
    }

    public String withLoop(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int fibNum = 0;
        arr.add(fibNum);
        int index = 0;
        while(fibNum<maxNum){
            if(arr.size() <= 1){
                arr.add(1);
            }else{
                fibNum = arr.get(index)+arr.get(index-1);
                if(fibNum<maxNum) {
                    arr.add(fibNum);
                }
            }
            index++;
        }
        String returnString = arr.toString();
        return returnString.substring(1,returnString.length()-1);
    }

    public String withRecursion(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        String returnString = addToArray(arr).toString();
        return returnString.substring(1,returnString.length()-1);
    }

    public ArrayList<Integer> addToArray(ArrayList<Integer> arr){
        int fibNum;
        if (arr.size() <= 1) {
            fibNum = 1;
        }else{
            fibNum = arr.get(arr.size() - 1) + arr.get(arr.size() - 2);
        }
        if(fibNum<maxNum) {
            arr.add(fibNum);
            arr = addToArray(arr);
        }
        return arr;
    }

}
