package LinkedList.DoublyLinkedList;
// Java Program to insert a node at the beginning of a
// doubly linked list

class Node {
    int data;
    Node next, prev;

    Node(int newData) {
        data = newData;
        next = prev = null;
    }
}

public class InsertionAtBegin {

    // Function to insert a new node at the front of
    // doubly linked list
    public static Node insertAtFront(Node head, int newData) {

        // Create a new node
        Node newNode = new Node(newData);

        // Make next of new node as head
        newNode.next = head;

        // Change prev of head node to new node
        if (head != null) {
            head.prev = newNode;
        }

        // Return the new node as the head of the doubly
        // linked list
        return newNode;
    }

    // Function to print the doubly linked list
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
    	// 2 <-> 3 <-> 4 -> NULL
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.prev = head;
        head.next.next = new Node(4);
        head.next.next.prev = head.next;

        // Print the original list
        System.out.println("Original Linked List: ");
        printList(head);

        // Insert a new node at the front of the list
        System.out.println(
            "After inserting Node at the front: ");
        int data = 1;
        head = insertAtFront(head, data);

        // Print the updated list
        printList(head);
    }
}

