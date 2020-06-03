package adrianromanski.algorithms.binary_search_tree;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    private BinarySearchTree bst;

    @Before
    public void SetUp() {
        bst = new BinarySearchTree();
    }

    @Test
    public void Insert() {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");
        bst.insert(8, "h");

        assertEquals("e", bst.find(5));
        assertEquals("c", bst.find(3));
        assertEquals("b", bst.find(2));
        assertEquals("d", bst.find(4));
        assertEquals("g", bst.find(7));
        assertEquals("f", bst.find(6));
        assertEquals("h", bst.find(8));
        assertEquals(null, bst.find(99));

        bst.prettyPrint();

//        bst.printInOrderTraversal();
//        bst.printPreOrderTraversal();
        bst.printPostOrderTraversal();
    }

    @Test
    public void MinKey() {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");

        assertEquals(2, bst.findMinKey());
    }

    @Test
    public void DeleteNoChild() {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");
        bst.insert(8, "h");

        bst.prettyPrint();
        bst.delete(2);
        bst.prettyPrint();

        assertNull(bst.find(2));
    }

    @Test
    public void DeleteOneChild() {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");
//        bst.insert(8, "h");
        bst.prettyPrint();
        bst.delete(7);
        bst.prettyPrint();

        assertNull(bst.find(7));


    }

    @Test
    public void DeleteTwoChildren() {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");
        bst.insert(8, "h");

        bst.prettyPrint();
        bst.delete(7);
        bst.prettyPrint();
        assertNull(bst.find(7));


    }
}
