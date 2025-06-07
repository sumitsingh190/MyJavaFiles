package LinkedList.SingLyLinkedList;

// Java program to detect loop in a linked list
// using Floyd's Cycle-Finding Algorithm

class Node {
    int data;
    Node next;

    public Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class DetectLoop {
    static boolean detectLoop(Node head) {
        // Handle edge case
        if (head == null) {
            return false;
        }
  
        // Fast and slow pointers initially points to the head
        Node slow = head, fast = head;

        // Loop that runs while fast and fast.next are not null
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If fast and slow pointer points to the same node,
            // then the cycle is detected
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 1 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
  
        // Create a loop: 4 -> 3 (points back to second node)
        head.next.next.next = head.next;

        if (detectLoop(head))
            System.out.println("Loop detected: true");
        else
            System.out.println("No loop detected: false");
    }
}
