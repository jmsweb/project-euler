package com.jmsweb.algorithm;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactor {

    public BigInteger highestFactor(String num) {
        BigInteger number = new BigInteger(num);
        List<BigInteger> factors = new ArrayList<>();
        BigInteger counter = BigInteger.TWO;
        while(true) {
            if (number.mod(counter).compareTo(BigInteger.ZERO) == 0) {
                number = number.divide(counter);
                factors.add(counter);
            }

            if (number.compareTo(BigInteger.ONE) == 0) {
                return Collections.max(factors);
            }

            counter = counter.add(BigInteger.ONE);
        }
    }
}
