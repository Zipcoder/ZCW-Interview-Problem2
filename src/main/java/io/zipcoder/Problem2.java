package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {


    public String fibIteration(int input) {

        String toReturn = "";

        ArrayList<Integer> fibAnswer = new ArrayList<Integer>();
        fibAnswer.add(0);
        fibAnswer.add(1);

        for (int i = 1; i < input; i++) {
            if ((fibAnswer.get(fibAnswer.size() - 2) + fibAnswer.get(fibAnswer.size() - 1)) > input) {
                break;
            }

            int numberToAdd = (fibAnswer.get(fibAnswer.size() - 2) + fibAnswer.get(fibAnswer.size() - 1));
            fibAnswer.add(numberToAdd);
            i = numberToAdd;
        }

        for (int i = 0; i < fibAnswer.size(); i++) {
            toReturn += fibAnswer.get(i);
            if (i < fibAnswer.size() - 1) {
                toReturn += ", ";
            }
        }

        return toReturn;
    }


    public String fibRecursion(int input, List<Integer> fibList) {

        if (fibList.size() == 0) {
            fibList.add(0);
            fibList.add(1);
        }

        int numberToAdd = (fibList.get(fibList.size() - 2) + fibList.get(fibList.size() - 1));


        if (numberToAdd > input) {
            String toReturn = "";
            for (int i = 0; i < fibList.size(); i++) {
                toReturn += fibList.get(i);
                if (i < fibList.size() - 1) {
                    toReturn += ", ";
                }
            }
            return toReturn;

        } else {
            fibList.add(numberToAdd);
            return fibRecursion(input, fibList);


        }
    }


}
