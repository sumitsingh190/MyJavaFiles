package Basics;

public class PrimeNumberInRange {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        // Check from 2 to √n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to print primes in the range [L, R]
    public static void printPrimes(int L, int R) {
        System.out.println("Prime numbers between " + L + " and " + R + " are:");
        for (int i = L; i <= R; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int L = 10, R = 50;  // You can change the range here
        printPrimes(L, R);
    }
}

//Time complexity: O(n * √n)
//Space Complexity: O(1)


