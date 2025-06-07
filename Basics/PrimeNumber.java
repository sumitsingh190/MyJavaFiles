// Java program to determine if a number is prime by using a count variable
package Basics;

// Main class
public class PrimeNumber
{
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // Initialize count to keep track of divisors
        int count = 0;

        // Check if the number is less than 2, as numbers less than 2 are not prime
        if (n < 2) {
            return false;
        }

        // Iterate from 2 to the square root of the number
        // If any number between 2 and sqrt(n) divides n, it's not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }

        // If count is still 0, it means n is prime as it has no divisors other than 1 and itself
        if (count == 0) {
            return true;
        }
        
        // Return false if count is not 0
        return false;
    }

    // Main method
    public static void main(String[] args) {
        // Test the isPrime method with the number 4 (Expected output: false)
        System.out.println(isPrime(4));

        // Test the isPrime method with the number 13 (Expected output: true)
        System.out.println(isPrime(13));
    }
}

//Time Complexity: O(sqrt(n))
//Space Complexity: O(1)