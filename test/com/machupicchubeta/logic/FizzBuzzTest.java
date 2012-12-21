/**
 * 
 */
package com.machupicchubeta.logic;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * @author machupicchubeta
 */
public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }
    @Test
    public void testGetFizzBuzz() throws Exception {
        assertThat(fizzBuzz.getFizzBuzz(1), is("1"));
        assertThat(fizzBuzz.getFizzBuzz(2), is("2"));
        assertThat(fizzBuzz.getFizzBuzz(3), is("Fizz"));
        assertThat(fizzBuzz.getFizzBuzz(4), is("4"));
        assertThat(fizzBuzz.getFizzBuzz(5), is("Buzz"));
        assertThat(fizzBuzz.getFizzBuzz(6), is("Fizz"));
        assertThat(fizzBuzz.getFizzBuzz(7), is("7"));
        assertThat(fizzBuzz.getFizzBuzz(8), is("8"));
        assertThat(fizzBuzz.getFizzBuzz(9), is("Fizz"));
        assertThat(fizzBuzz.getFizzBuzz(10), is("Buzz"));
        assertThat(fizzBuzz.getFizzBuzz(11), is("11"));
        assertThat(fizzBuzz.getFizzBuzz(12), is("Fizz"));
        assertThat(fizzBuzz.getFizzBuzz(13), is("13"));
        assertThat(fizzBuzz.getFizzBuzz(14), is("14"));
        assertThat(fizzBuzz.getFizzBuzz(15), is("FizzBuzz"));
        assertThat(fizzBuzz.getFizzBuzz(16), is("16"));
        assertThat(fizzBuzz.getFizzBuzz(17), is("17"));
        assertThat(fizzBuzz.getFizzBuzz(18), is("Fizz"));
        assertThat(fizzBuzz.getFizzBuzz(19), is("19"));
        assertThat(fizzBuzz.getFizzBuzz(20), is("Buzz"));
        assertThat(fizzBuzz.getFizzBuzz(21), is("Fizz"));
        assertThat(fizzBuzz.getFizzBuzz(22), is("22"));
    }
    @Test
    public void testGetFizzBuzzList() throws Exception {
        final String[] array = {
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz",
                "16",
                "17",
                "Fizz",
                "19",
                "Buzz",
                "Fizz",
                "22"};
        final List<String> list = new LinkedList<String>(Arrays.asList(array));
        assertThat(fizzBuzz.getFizzBuzzList(22), is(list));
    }
}
