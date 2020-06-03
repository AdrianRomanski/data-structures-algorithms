package adrianromanski.data_structures.linked_list;

public class LinkedList {

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;


    /**
     * O(1) CONSTANT
     */
    public void addFront(int data) {

        // Create new node
        Node newNode = new Node(data);

        // if head...
        if(head == null) {
            head = newNode;
            return;
        }

        // Set it's next to the current head
        newNode.next = head;

        // Set current head be the new head
        head = newNode;
    }


    public int getFirst() {
        if(head == null) {
            throw new IllegalStateException("Empty list");
        }
        return head.data;
    }


    /**
     * O(1) CONSTANT
     */
    public void clear() {
        head = null;
    }


    /**
     * O(n) LINEAR
     */
    public int getLast() {
         if(head == null) {
             throw new IllegalStateException("Empty list");
         }
         Node current = head;

         // While we are not in the tail
        while(current.next != null) {
            current = current.next; // 0(n)
        }

        // We at the tail
        return current.data;
    }


    /**
     * O(n) LINEAR
     */
    public void addBack(int data) {
        Node newNode = new Node(data);

        // if head set and return
        if(head == null) {
            head = newNode;
            return;
        }

        // Start at the head
        Node current = head;

        // Walk back  node = null
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    /**
     * O(n) LINEAR
     */
    public int size() {
        // if head set and return
        if(head == null) {
            return 0;
        }

        Node current = head;
        int count = 1;

        while(current.next != null) {
            current = current.next;
            count++;
        }
        return count;
    }



    /**
     * O(n) LINEAR
     */
    public void deleteValue(int data) {
        // if head set and return
        if(head == null) {
            return;
        }
        if(head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;

        while(current.next != null) {
            if(current.next.data == data) {
               current.next = current.next.next;
               return;
            }
            current = current.next;
        }
    }
}
