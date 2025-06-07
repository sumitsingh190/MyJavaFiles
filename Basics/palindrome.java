package Basics;

public class palindrome {
    // Java program to reverse a number
// and find if it is a palindrome or not

// Driver Class
    // Recursive function to reverse
    // the digits of number
    static int recursive_func(int n, int rev)
    {
        if (n < 10) {
            return rev * 10 + n;
        }
        else {
            int last_digit = n % 10;
            rev = rev * 10 + last_digit;
            return recursive_func(n / 10, rev);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int n = 123464321;
        int rev = recursive_func(n, 0);

        System.out.println("Reverse of n = " + rev);

        // Checking if n is same
        // as reverse of n
        if (n == rev)
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }
}
//Time complexity: O(log10(n))
//Space Complexity: O(n)



//Iterative function 


// Java program to reverse a number
// and find if it is a palindrome or not

// Driver Class
class Geeks
{
    // Iterative function to
    // reverse the digits of number
    static int reversNumber(int n)
    {
        int reversed_n = 0;
        while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;
        }
        return reversed_n;
    }

    // Main function
    public static void main(String[] args)
    {
        int n = 123464321;
        int reverseN = reversNumber(n);
        System.out.println("Reverse of n = " + reverseN);

        // Checking if n is same
        // as reverse of n
        if (n == reverseN)
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }
}

//Time complexity: O(log10(n))
//Space Complexity: O(1)