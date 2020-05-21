package com.jmsweb.quadrant1;

import com.jmsweb.algorithm.PrimeFactor;

/**
 * Largest prime factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * @author dorado
 *
 */
public class Problem3 {

    static PrimeFactor primeFactor;

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        primeFactor = problem3.getPrimeFactor();
        System.out.println(primeFactor.getFactors("13195"));
        System.out.println();
        System.out.println(primeFactor.getFactors("600851475143"));
    }

    public PrimeFactor getPrimeFactor() {
        return new PrimeFactor();
    }
}
