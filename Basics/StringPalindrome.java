package Basics;

public class StringPalindrome {
    // Java program to check if a number is a palindrome
// using two pointers if it is a string

    public static boolean isPalindrome(String s) {

        // Convert the string to char array for easier access
        char[] arr = s.toCharArray();

        // Two pointers: one at the start
        // and one at the end
        int l = 0, r = arr.length - 1;

        // Compare characters from both ends moving toward the center
        while (l < r) {
            if (arr[l] != arr[r]) {
                return false;  
            }
            // Move left pointer to the right
            l++; 
            // Move right pointer to the left  
            r--;  
        }

        return true;  // Return true if all characters match
    }

    public static void main(String[] args) {
        String s = "12345654321";
        
        // Checking if the string is a palindrome
        if (isPalindrome(s)) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }
}
//Time complexity: O(n)
//Space Complexity: O(n)
