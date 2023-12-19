package validating;

public class Calculator {

    public int factorial(int num) {
        if(num < 0) {
            throw new IllegalArgumentException("Number cant be negative!");
        }

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if((setSize < 0 && subsetSize < 0) && setSize > subsetSize){
            throw new IllegalArgumentException("Invalid input:"
                    + " setSize and subsetSize must be non-negative,"
                    + " and setSize must be greater than or equal to subsetSize.");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
