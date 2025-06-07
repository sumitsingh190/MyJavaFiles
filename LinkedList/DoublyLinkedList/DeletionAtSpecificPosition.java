package LinkedList.DoublyLinkedList;

// Java Program to delete node at a specific position
// in Doubly Linked List

class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
        data = d;
        prev = next = null;
    }
}

public class DeletionAtSpecificPosition {

    // Function to delete a node at a specific position 
    // in the doubly linked list
    static Node delPos(Node head, int pos) {

        // If the list is empty
        if (head == null)
            return head;

        Node curr = head;

        // Traverse to the node at the given position
        for (int i = 1; curr != null && i < pos; ++i) {
            curr = curr.next;
        }

        // If the position is out of range
        if (curr == null)
            return head;

        // Update the previous node's next pointer
        if (curr.prev != null)
            curr.prev.next = curr.next;

        // Update the next node's prev pointer
        if (curr.next != null)
            curr.next.prev = curr.prev;

        // If the node to be deleted is the head node
        if (head == curr)
            head = curr.next;

        // Deallocate memory for the deleted node
        curr = null;
        return head;
    }

    static void printList(Node head) {
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

        head = delPos(head, 2);

        printList(head);
    }
}
