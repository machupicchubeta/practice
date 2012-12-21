/**
 * 
 */
package com.machupicchubeta.logic;

import java.util.LinkedList;
import java.util.List;

/**
 * @author machupicchubeta
 */
public class Fibonacci {
    public Fibonacci() {
        super();
    }
    public Integer getFibonacciNumber(final Integer arg) throws IllegalArgumentException {
        if (arg == null) {
            throw new IllegalArgumentException("argument must positive integer.");
        } else if (arg.equals(0)) {
            return 0;
        } else if (arg.equals(1)) {
            return 1;
        } else if (arg.compareTo(1) > 0) {
            return getFibonacciNumber(arg - 2) + getFibonacciNumber(arg - 1);
        } else {
            throw new IllegalArgumentException("argument must positive integer.");
        }
    }
    public List<Integer> getFibonacciSequence(final Integer... args) {
        if (args == null || args.length == 0) {
            throw new IllegalArgumentException("argument must at least one parameter is required.");
        }
        final List<Integer> fibonacciSequence = new LinkedList<Integer>();
        for (int i = 0; i < args.length; i++) {
            fibonacciSequence.add(getFibonacciNumber(i));
        }
        return fibonacciSequence;
    }
}
