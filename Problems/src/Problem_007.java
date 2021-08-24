/*
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    What is the 10 001st prime number?
 */
public class Problem_007 {

    public static void main(String[] args) {
        int currentNumber = 2;
        int counter = 0;
        int primeCounter = 0;
        while (true) {
            if (counter > 7) {
                counter = 0;
            } else if (counter == 2 || counter == 3 || counter == 5 || counter == 7) {

            } else {
                primeCounter++;
            }

            if (primeCounter == 10001) {
                System.out.println(currentNumber);
                break;
            }

            counter++;
            currentNumber++;
        }
    }
}
