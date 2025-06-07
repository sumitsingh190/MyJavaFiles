package LinkedList.SingLyLinkedList;

// Java program to delete the head node
// from a linked list

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeletionAtBegin {

    // Delete the head node and return the new head
    static Node deleteHead(Node head) {
      
        // Check if the list is empty
        if (head == null)
            return null;

        // Store the current head in a temporary variable
        Node temp = head;

        // Move the head pointer to the next node
        head = head.next;

        // Help the garbage collector by 
      	// removing the reference
        temp = null;

        return head;
    }

    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
       
        // Create a hard-coded linked list:
        // 3 -> 12 -> 15 -> 18
        Node head = new Node(3);
        head.next = new Node(12);
        head.next.next = new Node(15);
        head.next.next.next = new Node(18);
        head = deleteHead(head);
        printList(head);
    }
}
