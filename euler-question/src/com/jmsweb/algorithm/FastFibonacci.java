package com.jmsweb.algorithm;

import java.math.BigInteger;

/**
 * Credit: {@link https://www.nayuki.io/res/fast-fibonacci-algorithms/FastFibonacci.java}
 *
 * @author dorado
 *
 */
public final class FastFibonacci {

    /**
     * Fast doubling method. Faster than the matrix method.
     * F(2n) = F(n) * (2*F(n+1) - F(n)).
     * F(2n+1) = F(n+1)^2 + F(n)^2.
     * This implementation is the non-recursive version. See the web page and
     * the other programming language implementations for the recursive version.
     */
    public BigInteger fastFibonacciDoubling(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for (int bit = Integer.highestOneBit(n); bit != 0; bit >>>= 1) {
            // Double it
            BigInteger d = multiply(a, b.shiftLeft(1).subtract(a));
            BigInteger e = multiply(a, a).add(multiply(b, b));
            a = d;
            b = e;

            // Advance by one conditionally
            if ((n & bit) != 0) {
                BigInteger c = a.add(b);
                a = b;
                b = c;
            }
        }
        return a;
    }

    /**
     * Multiplies two BigIntegers. This function makes it easy to swap in a faster algorithm like Karatsuba multiplication.
     *
     * @param x
     * @param y
     * @return
     */
    private BigInteger multiply(BigInteger x, BigInteger y) {
        return x.multiply(y);
    }
    
}
