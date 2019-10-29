public class SumOfSquares {
    public static void main(String[] args) {
        System.out.println("Sum of squares from 5 to 10 is " + calculateSumOfSquaresInRange(5, 10));
    }

    /**
     * This method calculates the sum of squares of integer in the range
     *
     * @param startInclusive first element in range
     * @param endInclusive last element in range
     * @return the sum of squares of each element in the range
     */
    static int calculateSumOfSquaresInRange(int startInclusive, int endInclusive) {
        if (endInclusive < startInclusive) {
            throw new InvalidRangeException();
        }

        // todo: refactor using functional approach
        int sumOfSquares = 0;
        for (int i = startInclusive; i <= endInclusive; i++) {
            sumOfSquares += i * i;
        }
        return sumOfSquares;
    }
}