package com.jmsweb.quadrant1;

import java.math.BigInteger;

import com.jmsweb.algorithm.FastFibonacci;
import com.jmsweb.algorithm.Fibonacci;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 * 
 * Actual Fibonaci Sequence = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 * 
 * @author dorado
 */
public class Problem2 {

    static Fibonacci fibonacci;
    static FastFibonacci fastFibonacci;

    public static void main(String[] args) {
        Problem2 problem2 = new Problem2();

        fibonacci = problem2.getFibonacci();
        fastFibonacci = problem2.getFastFibonacci();
        System.out.printf("the %s-th: %s%n", 10, fibonacci.nth(10));
        System.out.printf("the %s-th: %s%n", 10, fastFibonacci.fastFibonacciDoubling(10));
        System.out.printf("the even sum %s-th: %s%n%n", 10, fibonacci.evenSum(BigInteger.ONE, BigInteger.TWO, new BigInteger("50")));

        //System.out.printf("the %s-th: %s%n", 4000000, fibonacci.nth(4000000)); //Warning SLOW!!
        System.out.printf("the %s-th: %s%n", 4000000, fastFibonacci.fastFibonacciDoubling(4000000));
        System.out.printf("the even sum %s-th: %s%n%n", 4000000, fibonacci.evenSum(BigInteger.ONE, BigInteger.TWO, new BigInteger("4000000")));
    }

    public Fibonacci getFibonacci() {
        return new Fibonacci();
    }

    public FastFibonacci getFastFibonacci() {
        return new FastFibonacci();
    }
}
