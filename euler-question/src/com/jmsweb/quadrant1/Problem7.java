package com.jmsweb.quadrant1;

import com.jmsweb.algorithm.PrimeFactor;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 * 
 * @author dorado
 */
public class Problem7 {

    static PrimeFactor primeFactor = new PrimeFactor();
    static long timer;

    public static void main(String[] args) {

        timer = System.currentTimeMillis();
        System.out.printf("%s-th: %s in %sms %n", 6, primeFactor.nth(6), System.currentTimeMillis() - timer);

        timer = System.currentTimeMillis();
        System.out.printf("%s-th: %s in %sms %n", 10001, primeFactor.nth(10001), System.currentTimeMillis() - timer);
    }
}