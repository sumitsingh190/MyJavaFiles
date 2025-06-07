package LinkedList.SingLyLinkedList;

// Java program to delete a linked list node at a given
// position

// Node class to define a linked list node
class Node {
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class DeletionAtSpecificPosition {
    // Function to delete a node at a given position
    public static Node deleteNode(Node head, int position)
    {
        Node temp = head;
        Node prev = null;

        // Base case if linked list is empty
        if (temp == null)
            return head;

        // Case 1: Head is to be deleted
        if (position == 1) {
            head = temp.next;
            return head;
        }

        // Case 2: Node to be deleted is in middle
        // Traverse till given position
        for (int i = 1; temp != null && i < position; i++) {
            prev = temp;
            temp = temp.next;
        }

        // If given position is found, delete node
        if (temp != null) {
            prev.next = temp.next;
        }
        else {
            System.out.println("Data not present");
        }

        return head;
    }

    // Function to print the linked list
    public static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Driver code
    public static void main(String[] args)
    {
        // Creating a static linked list
        // 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Print original list
        System.out.print("Original list: ");
        printList(head);

        // Deleting node at position 2
        int position = 2;
        head = deleteNode(head, position);

        // Print list after deletion
        System.out.print("List after deletion: ");
        printList(head);
    }
}
