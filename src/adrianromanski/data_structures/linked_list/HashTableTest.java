package adrianromanski.data_structures.linked_list;

import adrianromanski.data_structures.HashTable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    private HashTable hashTable;

    @Before
    public void SetUp() {
        hashTable = new HashTable();
    }

    @Test
    public void PutAndGet() {
        hashTable.put("John Smith", "521-1234");
        hashTable.put("Lisa Smith", "521-8976");
        hashTable.put("Sam Doe", "521-5030");
        hashTable.put("Sandra Dee", "521-9655");
        hashTable.put("Ted Baker", "418-4165");

        assertEquals("521-1234", hashTable.get("John Smith"));
        assertEquals("521-8976", hashTable.get("Lisa Smith"));
        assertEquals("521-5030", hashTable.get("Sam Doe"));
        assertEquals("521-9655", hashTable.get("Sandra Dee"));
        assertEquals("418-4165", hashTable.get("Ted Baker"));
        assertEquals(null, hashTable.get("Tim Lee"));

        System.out.println(hashTable.toString());
    }

    @Test
    public void Empty() {
        assertEquals(null, hashTable.get("Ted Baker"));
        assertEquals(null, hashTable.get("Tim Lee"));
        System.out.println(hashTable.toString());
    }

    @Test
    public void Collision() {
        // these keys will collide
        hashTable.put("John Smith", "521-1234");
        hashTable.put("Sandra Dee", "521-9655");

        assertEquals("521-1234", hashTable.get("John Smith"));
        assertEquals("521-9655", hashTable.get("Sandra Dee"));
        assertEquals(null, hashTable.get("Tim Lee"));
    }
}