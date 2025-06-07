package LinkedList.SingLyLinkedList;

class Node {
    int data;      // the data value
    Node next;     // the reference to the next Node in the linked list
    
    Node(int data1) {
        this.data = data1;  // Initialize data with the provided value
        this.next = null;   // Initialize next as null since it's the end of the list
    }
}

public class CreatingLL {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        // Creating a new Node with the value from the array
        Node y = new Node(arr[0]);
        // Printing the data stored in the Node
        System.out.println(y.data);
    }
}
