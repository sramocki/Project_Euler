/*
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem_004 {

    public static void main(String[] args) {
        int largestPal = 0;
        for (int i = 999; i > 100; i--) {
            for (int j = 999; j > 100; j--) {
                int product = i * j;
                if (isPal(product) && product > largestPal) {
                    largestPal = product;
                }
            }
        }
        System.out.println(largestPal);
    }

    public static boolean isPal(int i) {
        return Integer.toString(i).equals(new StringBuilder(Integer.toString(i)).reverse().toString());
    }
}
