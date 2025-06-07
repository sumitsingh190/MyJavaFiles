package Arrays;
import java.util.HashMap;
public class TwoSumVariant {
    // Java program to find a pair with a given sum in an array
    public static int[] findTwoSumIndices(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                // Found the pair
                return new int[] { map.get(complement), i }; // 0-based index
            }

            // Store current element with its index
            map.put(arr[i], i);
        }

        // If no pair found
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSumIndices(arr, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No such pair found.");
        }
    }
}


