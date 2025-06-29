package LinkedList.DoublyLinkedList;

// Java Program to delete a node from the end of Doubly Linked List

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DeletionAtEnd {
  
    // Function to delete the last node of the doubly linked list
    public static Node delLast(Node head) {
      
        // Corner cases
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }

        // Traverse to the last node
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        // Update the previous node's next pointer
        if (curr.prev != null) {
            curr.prev.next = null;
        }

        // Return the updated head
        return head;
    }

    // Function to print the list
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
      
        // Create a hardcoded doubly linked list:
        // 1 <-> 2 <-> 3
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        System.out.print("Original Linked List: ");
        printList(head);

        System.out.print("After Deletion at the end: ");
        head = delLast(head);

        printList(head);
    }
}
