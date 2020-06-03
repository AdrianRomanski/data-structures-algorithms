package adrianromanski.data_structures.linked_list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    private LinkedList linkedList;

    @Before
    public void SetUp() throws Exception {
        linkedList = new LinkedList();
    }

    @Test
    public void AddFront() {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        assertEquals(3, linkedList.getFirst());
        assertEquals(1, linkedList.getLast());
    }

    @Test
    public void AddBack() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        assertEquals(1, linkedList.getFirst());
        assertEquals(3, linkedList.getLast());
    }

    @Test
    public void GetFirst() {
        linkedList.addFront(1);

        assertEquals(1, linkedList.getFirst());
    }

    @Test
    public void GetLast() {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        assertEquals(1, linkedList.getLast());
    }

    @Test
    public void Size() {
        assertEquals(0, linkedList.size());
        linkedList.addBack(1);
        assertEquals(1, linkedList.size());
        linkedList.addBack(2);
        assertEquals(2, linkedList.size());
    }

    @Test
    public void Clear() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.clear();

        assertEquals(0, linkedList.size());
    }

    @Test
    public void DeleteValue() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.deleteValue(2);

        assertEquals(2, linkedList.size());
        assertEquals(1, linkedList.getFirst());
        assertEquals(3, linkedList.getLast());
    }
}
