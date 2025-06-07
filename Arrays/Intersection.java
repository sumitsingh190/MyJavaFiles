package Arrays;
import java.util.ArrayList;
public class Intersection {
    // Java program for intersection of 
// two sorted arrays with distinct elements
    public static ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int i = 0;
        int j = 0;

        // Start simultaneous traversal on both arrays
        while (i < a.length && j < b.length) {
          
            // if a[i] is smaller, then move in a[] 
            // towards larger value
            if (a[i] < b[j]) {
                i++;
            } 
          
            // if b[j] is smaller, then move in b[]
            // towards larger value
            else if (a[i] > b[j]) {
                j++;
            } 
          
            // if a[i] == b[j], then this element is common
            // add it to result array and move in both arrays
            else {
                res.add(a[i]);
                i++; 
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6}; 
        int[] b = {2, 4, 7, 9};
 
        ArrayList<Integer> res = intersection(a, b);
  
        for (int i = 0; i < res.size(); i++) 
            System.out.print(res.get(i) + " ");
    }
}
    
