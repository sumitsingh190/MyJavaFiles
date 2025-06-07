package Arrays;

public class CountSubarrayswithSumK {

    // Function to count and print subarrays with sum k
    static int countSubarrays(int[] arr, int k) {
        int res = 0;

        // Start point of subarray
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;

            // End point of subarray
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];

                if (sum == k) {
                    res++;

                    // Print the subarray
                    System.out.print("Subarray: ");
                    for (int i = start; i <= end; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        int total = countSubarrays(arr, k);
        System.out.println("Total Subarrays with sum " + k + " = " + total);
    }
}
