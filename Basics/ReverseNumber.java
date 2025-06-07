package Basics;

public class ReverseNumber {
    // Java program to reverse a number

// Driver Class
    // Function to reverse the number
    static int reverse(int n)
    {
        // reversed number
        int rev = 0;
        // remainder
        int rem;

        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }

        return rev;
    }

    // Driver Function
    public static void main(String[] args)
    {
        int n = 4526;

        System.out.print("Reversed Number is: "
                         + reverse(n));
    }
}

//Time complexity: O(log10(n))
//Space Complexity: O(1)


//recursive 

// Java program to reverse
// a number recursively


class Geeks
{
    // stores reversed number
    static int rev = 0;

    // Function to reverse the number
    static void reverse(int n)
    {

        if (n <= 0)
            return;
        // remainder
        int rem = n % 10;
        rev = (rev * 10) + rem;
        reverse(n / 10);
    }

    // Driver Function
    public static void main(String[] args)
    {
        int n = 4526;
        reverse(n);
        System.out.print("Reversed Number is: " + rev);
    }
}
