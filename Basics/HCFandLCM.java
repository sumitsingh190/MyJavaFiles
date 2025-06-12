package Basics;

public class HCFandLCM {
   
    // Function to find HCF using Euclidean algorithm
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;  // Now, a is the HCF
    }

    // Function to find LCM using the relation: LCM(a, b) = (a * b) / HCF(a, b)
    public static int findLCM(int a, int b) {
        return (a * b) / findHCF(a, b);
    }

    public static void main(String[] args) {
        int num1 = 60, num2 = 48;

        int hcf = findHCF(num1, num2);
        int lcm = findLCM(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " = " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);
    }
}
//Time complexity: O(log(min(a, b)))
//Space Complexity: O(1)

public class LCMWithoutHCF {

    // Function to find LCM without HCF
    public static int findLCM(int a, int b) {
        int max = Math.max(a, b); // Start checking from the max of a and b

        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max; // Found LCM
            }
            max++; // Keep checking next number
        }
    }

    public static void main(String[] args) {
        int num1 = 60, num2 = 48;

        int lcm = findLCM(num1, num2);

        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);
    }
}


// worst case - O(a*b)