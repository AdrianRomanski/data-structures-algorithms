package adrianromanski.challanges.linked_list;

// This is an implementation of Floyd's cycle-finding algorithm for detecting loops
// https://en.wikipedia.org/wiki/Cycle_detection#Tortoise_and_hare
public class LinkedListLoopDetector {

    public Node head;

    public void addBack(Node newNode) {

        if(head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while(current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public boolean hasLoop() {
        return hasLoop(head);
    }


    boolean hasLoop(Node first) {
        Node slow = first;
        Node fast = first;

        while(fast != null && fast.next != null) {
            slow = slow.next; // 1 hop
            fast = fast.next.next; // 2 hops

            if(slow == fast)  // fast caught up to slow, so there is a loop
                return true;
        }
        return false; // fast reached null, so the list terminates
    }
}

