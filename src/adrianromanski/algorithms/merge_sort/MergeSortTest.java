package adrianromanski.algorithms.merge_sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {

    private MergeSort mergeSort;

    @Before
    public void SetUp() {
        mergeSort = new MergeSort();
    }

    @Test
    public void Sort() {

        //           l                  r
        int arr[] = {4, 7, 14, 1, 3, 9, 17};

        int l = 0;              // left pointer
        int r = arr.length - 1; // right pointer

        mergeSort.sort(arr, l, r);

        assertEquals(1, arr[0]);
        assertEquals(3, arr[1]);
        assertEquals(4, arr[2]);
        assertEquals(7, arr[3]);
        assertEquals(9, arr[4]);
        assertEquals(14, arr[5]);
        assertEquals(17, arr[6]);

        System.out.println("\nSorted array");
        mergeSort.printArray(arr);
    }

}
