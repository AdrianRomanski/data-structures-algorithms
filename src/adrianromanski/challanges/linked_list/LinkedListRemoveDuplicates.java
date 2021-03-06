package adrianromanski.challanges.linked_list;

import java.util.HashSet;

public class LinkedListRemoveDuplicates {

    public Node head;

    public void addBack(int data) {
        Node newNode = new Node(data);

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

    public void removeDuplicates() {
        Node current = head;
        HashSet<Integer> uniques = new HashSet<>();
        Node previous = null;

        while(current != null) {
            if(uniques.contains(current.data)) {
                previous.next = current.next;
            } else {
                uniques.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        }

        int count = 1;
        Node current = head;

        while (current.next != null) {
            current = current.next;
            count++;
        }
        return count;
    }
}
