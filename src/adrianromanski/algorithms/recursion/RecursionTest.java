package adrianromanski.algorithms.recursion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursionTest {

    private Recursion recursion;

    @Before
    public void SetUp() {
        recursion = new Recursion();
    }


    /*
    Channel formatter
    Write a recursive algorithm that strips the leading zeros off Strings of text.
    Simply strip off one zero at a time, and then recursively call yourself
    until no leading zeros from the original string are left.
     */
    @Test
    public void StripLeadingZeros() {
        assertEquals("1", recursion.stripZeros("0001"));
        assertEquals("11", recursion.stripZeros("00011"));
        assertEquals("1989", recursion.stripZeros("00001989"));
        assertEquals("VOD", recursion.stripZeros("VOD"));
    }

}
