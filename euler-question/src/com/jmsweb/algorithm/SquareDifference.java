package com.jmsweb.algorithm;

import java.math.BigInteger;

public class SquareDifference {

    public Integer sum(Integer initial, Integer maximum) {
        int sum = 0;
        int pow = 0;
        for(int i = initial; i <= maximum; i++) {
            sum += Math.pow(i, 2);
            pow += i;
        }
        pow = (int)Math.pow(pow, 2);
        return pow - sum;
    }

    public BigInteger sum(Long initial, Long maximum) {
        BigInteger sum = BigInteger.ZERO;
        BigInteger pow = BigInteger.ZERO;
        for(long i = initial; i <= maximum; i++) {
            sum = sum.add(new BigInteger(String.valueOf((int)Math.pow(i, 2))));
            pow = pow.add(new BigInteger(String.valueOf(i)));
        }
        pow = pow.pow(2);
        return pow.subtract(sum);
    }
}