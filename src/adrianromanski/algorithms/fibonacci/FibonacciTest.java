package adrianromanski.algorithms.fibonacci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    private FibonacciNaive naive;
    private FibonacciMemoized memo;

    @Before
    public void SetUp() {
        naive = new FibonacciNaive();
        memo = new FibonacciMemoized();
    }

    @Test
    public void Naive() {
        assertEquals(0, naive.fib(0));
        assertEquals(1, naive.fib(1));
        assertEquals(1, naive.fib(2));
        assertEquals(2, naive.fib(3));
        assertEquals(3, naive.fib(4));
        assertEquals(5, naive.fib(5));
        assertEquals(8, naive.fib(6));
        assertEquals(13, naive.fib(7));
        assertEquals(21, naive.fib(8));
    }

    @Test
    public void Memoized() {
        assertEquals(0, memo.fib(0));
        assertEquals(1, memo.fib(1));
        assertEquals(1, memo.fib(2));
        assertEquals(2, memo.fib(3));
        assertEquals(3, memo.fib(4));
        assertEquals(5, memo.fib(5));
        assertEquals(8, memo.fib(6));
        assertEquals(13, memo.fib(7));
        assertEquals(21, memo.fib(8));
    }

    @Test
    public void RecordTimeNaive() {
        long startTime = System.currentTimeMillis();
        naive.fib(30);
        long endTime = System.currentTimeMillis();
        long elapsedTime = (endTime - startTime) / 1000;
        System.out.println("elapsedTime = " + elapsedTime); // 19s
    }

    @Test
    public void RecordTimeMemoized() {
        long startTime = System.currentTimeMillis();
        memo.fib(1000);
        long endTime = System.currentTimeMillis();
        long elapsedTime = (endTime - startTime) / 1000;
        System.out.println("elapsedTime = " + elapsedTime); // 20s
    }

}
