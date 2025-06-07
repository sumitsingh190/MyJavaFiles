package Arrays;
import java.util.*;

public class RotateByClk {
    // Function to rotate a square matrix by 90 
    // degrees in clockwise direction
    static void rotate90(int[][] mat) {
        int n = mat.length;

        // Perform Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        rotate90(mat);

        // Print the rotated matrix
        for (int i = 0; i < mat.length; i++) { // Loop over rows
            for (int j = 0; j < mat[i].length; j++) { // Loop over columns in current row
                System.out.print(mat[i][j] + " ");
            }
        System.out.println(); // Move to next line after each row
        }

    }
}