/**
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem_006 {
    public static void main(String[] args) {
        int difference = squareSum(100) - sumSquares(100);
        System.out.println(difference);
    }

    public static int sumSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public static int squareSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return (int) Math.pow(sum, 2);
    }
}
