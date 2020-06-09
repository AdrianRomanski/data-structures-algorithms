package adrianromanski.algorithms.bubble_sort;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest {

    private BubbleSort bubbleSort;

    @Before
    public void SetUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void Sort() {
        int[] array = {5, 1, 4, 2, 8};

        int[] sorted = bubbleSort.sort(array);

        assertEquals(1, sorted[0]);
        assertEquals(2, sorted[1]);
        assertEquals(4, sorted[2]);
        assertEquals(5, sorted[3]);
        assertEquals(8, sorted[4]);
    }

}