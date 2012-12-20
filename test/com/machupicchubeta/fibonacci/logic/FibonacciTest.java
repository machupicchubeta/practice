/**
 * 
 */
package com.machupicchubeta.fibonacci.logic;

import java.util.LinkedList;
import java.util.List;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

/**
 * @author machupicchubeta
 */
public class FibonacciTest {
    private Fibonacci fibonacci;
    @Before
    public void setUp() throws Exception {
        fibonacci = new Fibonacci();
    }
    @Test
    public void testGetFibonacciNumber() throws Exception {
        MatcherAssert.assertThat(fibonacci.getFibonacciNumber(0), Is.is(0));
        MatcherAssert.assertThat(fibonacci.getFibonacciNumber(1), Is.is(1));
        MatcherAssert.assertThat(fibonacci.getFibonacciNumber(2), Is.is(0 + 1));
        MatcherAssert.assertThat(fibonacci.getFibonacciNumber(3), Is.is(1 + 1));
        MatcherAssert.assertThat(fibonacci.getFibonacciNumber(4), Is.is(1 + 2));
        MatcherAssert.assertThat(fibonacci.getFibonacciNumber(5), Is.is(2 + 3));
        MatcherAssert.assertThat(fibonacci.getFibonacciNumber(6), Is.is(3 + 5));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFibonacciNumberWithException1() throws Exception {
        fibonacci.getFibonacciNumber(-1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFibonacciNumberWithException2() throws Exception {
        fibonacci.getFibonacciNumber(null);
    }
    @Test
    public void testGetFibonacciSequence() throws Exception {
        final List<Integer> list = new LinkedList<Integer>();
        list.add(0);
        MatcherAssert.assertThat(fibonacci.getFibonacciSequence(0), Is.is(list));
        list.add(1);
        MatcherAssert.assertThat(fibonacci.getFibonacciSequence(new Integer[] {0, 1}), Is.is(list));
        list.add(1);
        MatcherAssert.assertThat(fibonacci.getFibonacciSequence(new Integer[] {0, 1, 2}), Is.is(list));
        list.add(2);
        MatcherAssert.assertThat(fibonacci.getFibonacciSequence(new Integer[] {0, 1, 2, 3}), Is.is(list));
        list.add(3);
        MatcherAssert.assertThat(fibonacci.getFibonacciSequence(new Integer[] {0, 1, 2, 3, 4}), Is.is(list));
        list.add(5);
        MatcherAssert.assertThat(fibonacci.getFibonacciSequence(new Integer[] {0, 1, 2, 3, 4, 5}), Is.is(list));
        list.add(8);
        MatcherAssert.assertThat(fibonacci.getFibonacciSequence(new Integer[] {0, 1, 2, 3, 4, 5, 6}), Is.is(list));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFibonacciSequenceWithException1() throws Exception {
        fibonacci.getFibonacciSequence(new Integer[0]);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFibonacciSequenceWithException2() throws Exception {
        fibonacci.getFibonacciSequence(null);
    }
}
