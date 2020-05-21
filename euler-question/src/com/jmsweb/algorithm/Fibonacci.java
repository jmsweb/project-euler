package com.jmsweb.algorithm;

import java.math.BigInteger;

public class Fibonacci {

    //Start with 0, 1
    /**
     * Caution > 7 minutes for 4,000,000th
     * @param num
     * @return {@link BigInteger} the n-th of fibonacci
     */
    public BigInteger nth(int num) {
        int counter = 0;
        BigInteger sum = BigInteger.ZERO, seq1 = BigInteger.ZERO, seq2 = BigInteger.ONE;
        while (true) {
            if (counter == num) {
                return sum;
            }
            sum = seq1.add(seq2);
            seq1 = seq2;
            seq2 = sum;
            counter++;
        }
    }

    public BigInteger evenSum(BigInteger seq1, BigInteger seq2, BigInteger maximum) {
        BigInteger sum = BigInteger.ZERO;
        BigInteger evenSum = BigInteger.ZERO;
        while (true) {
            sum = seq1.add(seq2);
            if (seq1.compareTo(maximum) == -1) {
                if (seq1.mod(BigInteger.TWO) == BigInteger.ZERO) {
                    evenSum = evenSum.add(seq1);
                }
            } else {
                return evenSum;
            }
            seq1 = seq2;
            seq2 = sum;
        }
    }
}
