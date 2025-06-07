package Arrays;

//Moore's Voting Algorithm
public class MajorityElement {
    // Java program to find Majority
// element in an array
    static int majorityElement(int[] arr) {
        int n = arr.length;
        int candidate = -1;
        int count = 0;

        // Find a candidate
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];  // Get the current element

            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }


        // Validate the candidate
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];  // get the current element
            if (num == candidate) {
                count++;
            }
        }

	
      	// If count is greater than n / 2, return the candidate; otherwise, return -1
        if (count > n / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        System.out.println(majorityElement(arr));
    }
}
    
