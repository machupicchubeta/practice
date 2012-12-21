package com.machupicchubeta.logic;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class PrimeNumbersTest {
    private PrimeNumbers primeNumbers;
    @Before
    public void setUp() throws Exception {
        primeNumbers = new PrimeNumbers();
    }
    @Test
    public void testGetPrimeNumbers() throws Exception {
        final List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(11);
        list.add(13);
        list.add(17);
        list.add(19);
        list.add(23);
        list.add(29);
        list.add(31);
        list.add(37);
        list.add(41);
        assertThat(primeNumbers.getPrimeNumbers(42), is(list));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetPrimeNumbersWithException1() throws Exception {
        primeNumbers.getPrimeNumbers(null);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetPrimeNumbersWithException2() throws Exception {
        primeNumbers.getPrimeNumbers(0);
    }
    @Test
    public void testIsPrimeNumber() throws Exception {
        assertThat(primeNumbers.isPrimeNumber(1), is(Boolean.TRUE));
        assertThat(primeNumbers.isPrimeNumber(2), is(Boolean.TRUE));
        assertThat(primeNumbers.isPrimeNumber(3), is(Boolean.TRUE));
        assertThat(primeNumbers.isPrimeNumber(4), is(Boolean.FALSE));
        assertThat(primeNumbers.isPrimeNumber(5), is(Boolean.TRUE));
        assertThat(primeNumbers.isPrimeNumber(6), is(Boolean.FALSE));
        assertThat(primeNumbers.isPrimeNumber(7), is(Boolean.TRUE));
        assertThat(primeNumbers.isPrimeNumber(8), is(Boolean.FALSE));
        assertThat(primeNumbers.isPrimeNumber(9), is(Boolean.FALSE));
        assertThat(primeNumbers.isPrimeNumber(10), is(Boolean.FALSE));
        assertThat(primeNumbers.isPrimeNumber(11), is(Boolean.TRUE));
        assertThat(primeNumbers.isPrimeNumber(12), is(Boolean.FALSE));
        assertThat(primeNumbers.isPrimeNumber(13), is(Boolean.TRUE));
        assertThat(primeNumbers.isPrimeNumber(14), is(Boolean.FALSE));
        assertThat(primeNumbers.isPrimeNumber(15), is(Boolean.FALSE));
        assertThat(primeNumbers.isPrimeNumber(16), is(Boolean.FALSE));
        assertThat(primeNumbers.isPrimeNumber(17), is(Boolean.TRUE));
        assertThat(primeNumbers.isPrimeNumber(18), is(Boolean.FALSE));
        assertThat(primeNumbers.isPrimeNumber(19), is(Boolean.TRUE));
        assertThat(primeNumbers.isPrimeNumber(20), is(Boolean.FALSE));
        assertThat(primeNumbers.isPrimeNumber(21), is(Boolean.FALSE));
        assertThat(primeNumbers.isPrimeNumber(22), is(Boolean.FALSE));
        assertThat(primeNumbers.isPrimeNumber(23), is(Boolean.TRUE));
        assertThat(primeNumbers.isPrimeNumber(24), is(Boolean.FALSE));
        assertThat(primeNumbers.isPrimeNumber(25), is(Boolean.FALSE));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testIsPrimeNumberWithException1() throws Exception {
        primeNumbers.isPrimeNumber(null);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testIsPrimeNumberWithException2() throws Exception {
        primeNumbers.isPrimeNumber(0);
    }
}
