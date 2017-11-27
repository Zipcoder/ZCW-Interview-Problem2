package io.zipcoder;

public class Problem2 {

    Problem2() {
    }

    public String iterationSolution(int n) {
        StringBuilder solution = new StringBuilder();

        int x = 0, y = 1, z = 1;

        for (int i = 0; x < n; i++) {
            solution.append(x + ", ");
            x = y;
            y = z;
            z = x + y;
        }

        return solution.toString();
}


   //Does not work, have to convert to last addition to solutionString to Integer and append I guess
    private static String recursionSolution(int n, Integer x, String solution) {
        String solutionString = solution + ", ";
        String nResult;
        if (n == 1)
            return solutionString = "1";
        else
            solution = n * recursionSolution(n-1,solutionString);
            return solutionString;
        return null;
    }
}
