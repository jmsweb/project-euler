package com.jmsweb.quadrant1;

import com.jmsweb.algorithm.SmallestMultiple;

/**
 * Smallest Multiple
 *
 * Problem 5
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * @author dorado
 *
 */
public class Problem5 {

    static SmallestMultiple smallestMultiple = new SmallestMultiple();
    static long start;

    public static void main(String[] args) {
        //~2ms Optimization for Performance with Mathematical concept in prime factors
        start = System.currentTimeMillis();
        System.out.printf("%s..%s = %s in %sms %n", 1, 20, smallestMultiple.smallest(20), System.currentTimeMillis() - start);

        //~7 seconds Brute Force with primitive data type
        start = System.currentTimeMillis();
        System.out.printf("%s..%s = %s in %sms %n", 1, 20, smallestMultiple.smallest(1, 20), System.currentTimeMillis() - start);

        //~35 seconds Brute Force with BigInteger
        start = System.currentTimeMillis();
        System.out.printf("%s..%s = %s in %sms %n", 1, 20, smallestMultiple.smallest("1", "20"), System.currentTimeMillis() - start);
    }
}