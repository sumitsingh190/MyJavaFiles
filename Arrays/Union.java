package Arrays;
import java.util.ArrayList;
public class Union {
    // Java program to find union of two sorted arrays using 
// merge step of merge sort
    
    static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = a.length;
        int m = b.length;
        
        // This is similar to merge of merge sort
        int i = 0, j = 0;
        while(i < n && j < m) {
            
            // Skip duplicate elements in the first array
            if(i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }
            
            // Skip duplicate elements in the second array
            if(j > 0 && b[j - 1] == b[j]) {
                j++;
                continue;
            }
            
            // select and add the smaller element and move
            if(a[i] < b[j]) {
                res.add(a[i]);
                i++;
            } 

            else if(a[i] > b[j]) {
                res.add(b[j]);
                j++;
            } 
            
            // If equal, then add to result and move both 
            else {
                res.add(a[i]);
                i++;
                j++;
            }
        }
        
        // Add the remaining elements of a[]
        while (i < n) {
          
            // Skip duplicate elements in the first array
            if(i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }
            res.add(a[i]);
            i++;
        }
      
        // Add the remaining elements of b[]
        while (j < m) {
          
            // Skip duplicate elements in the second array
            if(j > 0 && b[j - 1] == b[j]) {
                j++;
                continue;
            }
            res.add(b[j]);
            j++;
        }
        return res;
    }
    
    public static void main(String[] args) {
      
        int[] a = {1, 1, 2, 2, 2, 4};
        int[] b = {2, 2, 4, 4};
        ArrayList<Integer> res = findUnion(a, b);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
