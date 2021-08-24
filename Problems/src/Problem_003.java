/*
    The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143 ?
 */

public class Problem_003 {
    public static void main(String[] args) {
        long max_value = 600851475143L;
        long largestPrimeFactor = max_value;
        long i = 2;
        while (i <= max_value) {
            if (max_value % i == 0) {
                max_value = max_value / i;
                largestPrimeFactor = i;
            } else {
                i += 1;
            }
        }

        System.out.println(largestPrimeFactor);
    }
}
