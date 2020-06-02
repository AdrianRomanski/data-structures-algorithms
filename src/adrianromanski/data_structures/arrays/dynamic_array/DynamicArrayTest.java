package adrianromanski.data_structures.arrays.dynamic_array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DynamicArrayTest {

    private DynamicArray array;

    @Before
    public void SetUp() throws Exception {
        array = new DynamicArray<String>(2);
    }

    @Test
    public void GetAndSet() throws Exception {
        array.set(0, "a");
        assertEquals("a", array.get(0));
    }

    @Test
    public void Insert() throws Exception {
        array.add("a"); // 0
        array.add("b"); // 1
        array.add("c"); // 2

        array.insert(1, "d");

        assertEquals(4, array.size());
        assertEquals("a", array.get(0));
        assertEquals("d", array.get(1));
        assertEquals("b", array.get(2));
        assertEquals("c", array.get(3));
    }

    @Test
    public void delete() {
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");
        array.add("f");

        array.delete(3);

        assertEquals(5, array.size());
        assertEquals("a", array.get(0));
        assertEquals("b", array.get(1));
        assertEquals("c", array.get(2));
        assertEquals("e", array.get(3));
        assertEquals("f", array.get(4));
    }
}
