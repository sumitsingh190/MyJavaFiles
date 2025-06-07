package Basics;

public class VowelsConstants {

    public static void countVowelsAndConsonants(String str) {
        // Convert to lowercase to make the check case-insensitive
        str = str.toLowerCase();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is a letter
            if (Character.isLetter(ch)) {
                // Check if it's a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        String input = "Hello Java World!";
        System.out.println("Input String: " + input);
        countVowelsAndConsonants(input);
    }
}

//Time complexity: O(n)
//Space Complexity: O(1)


