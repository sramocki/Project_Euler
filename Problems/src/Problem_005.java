/*
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem_005 {
    public static void main(String[] args) {
        int smallestPos = 20;
        int i = 2;
        while (i <= 20) {
            if (smallestPos % i == 0) {
                i++;
            } else {
                smallestPos += 20;
                i = 2;
            }
        }
        System.out.println(smallestPos);
    }
}
