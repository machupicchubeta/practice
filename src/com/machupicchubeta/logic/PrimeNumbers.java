/**
 * 
 */
package com.machupicchubeta.logic;

import java.util.LinkedList;
import java.util.List;

/**
 * @author machupicchubeta
 */
public class PrimeNumbers {
    public PrimeNumbers() {
        super();
    }
    public List<Integer> getPrimeNumbers(final Integer arg) throws IllegalArgumentException {
        final List<Integer> primeNumbers = new LinkedList<Integer>();
        if (arg == null) {
            throw new IllegalArgumentException("argument must positive integer.");
        } else if (arg.equals(0)) {
            throw new IllegalArgumentException("argument must positive integer.");
        }
        for (int i = 1; i <= arg; i++) {
            if (isPrimeNumber(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
    public Boolean isPrimeNumber(final Integer arg) {
        if (arg == null) {
            throw new IllegalArgumentException("argument must positive integer.");
        } else if (arg.equals(0)) {
            throw new IllegalArgumentException("argument must positive integer.");
        } else if (arg.equals(1)) {
            return Boolean.TRUE;
        }
        final int n = arg.intValue();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (i < n) {
                    return Boolean.FALSE;
                } else if (i == n) {
                    return Boolean.TRUE;
                }
            }
        }
        throw new IllegalArgumentException("argument must positive integer.");
    }
}
