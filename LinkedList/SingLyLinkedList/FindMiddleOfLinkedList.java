package LinkedList.SingLyLinkedList;
import java.util.*;

// Node class represents a node in the linked list
class Node {
    // Data stored in the node
    int data; 
    // Pointer to the next node in the list
    Node next;     

    // Constructor with both data and next node as parameters
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor with only data as a parameter, sets next to null
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FindMiddleOfLinkedList {
    
    // Method to find the middle of the linked list
    static void findMiddle(Node head) {
        // Check for empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        // Initialize the slow pointer to the head.
        Node slow = head; 
        
        // Initialize the fast pointer to the head.
        Node fast = head;   

        // Traverse the linked list using the Tortoise and Hare algorithm.
        // The fast pointer moves 2 steps and slow pointer moves 1 step at a time
        while (fast != null && fast.next != null) {
            fast = fast.next.next;  // Move fast two steps.
            slow = slow.next;  // Move slow one step.
        }

        // If the fast pointer is null, it's an even-length list
        // Slow will be at the second middle element
        if (fast == null) {
            // Even-length list: find both first and second middle elements
            if (slow != null) {
                // Find the first middle element by going back one step
                Node current = head;
                while (current.next != slow) {
                    current = current.next;
                }
                System.out.println("The middle nodes values (Even-length) are: " + current.data + " and " + slow.data);
            }
        } else {
            // Odd-length list: slow will be at the middle element
            System.out.println("The middle node value (Odd-length) is: " + slow.data);
        }
    }

    public static void main(String[] args) {
        // Creating a sample linked list (odd-length):
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Find the middle node (for odd-length list)
        findMiddle(head);
        
        // Test with even-length list:
        Node headEven = new Node(1);
        headEven.next = new Node(2);
        headEven.next.next = new Node(3);
        headEven.next.next.next = new Node(4);

        // Find the middle nodes for even-length list
        findMiddle(headEven);
    }
}
