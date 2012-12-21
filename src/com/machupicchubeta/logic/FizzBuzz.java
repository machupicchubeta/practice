/**
 * 
 */
package com.machupicchubeta.logic;

import java.util.LinkedList;
import java.util.List;

/**
 * @author machupicchubeta
 */
public class FizzBuzz {
    public FizzBuzz() {
        super();
    }
    public String getFizzBuzz(final Integer arg) throws IllegalArgumentException {
        if (arg == null || arg.compareTo(0) < 0) {
            throw new IllegalArgumentException("argument must positive integer.");
        }
        final int n = arg.intValue();
        if (n % (3 * 5) == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return arg.toString();
        }
    }
    public List<String> getFizzBuzzList(final Integer arg) throws IllegalArgumentException {
        if (arg == null || arg.compareTo(0) < 0) {
            throw new IllegalArgumentException("argument must positive integer.");
        }
        final List<String> fizzBuzz = new LinkedList<String>();
        final int n = arg.intValue();
        for (int i = 1; i <= n; i++) {
            fizzBuzz.add(getFizzBuzz(i));
        }
        return fizzBuzz;
    }
}
