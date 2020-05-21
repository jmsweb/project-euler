package com.jmsweb.algorithm;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public List<BigInteger> getFactors(String num) {
        BigInteger number = new BigInteger(num);
        List<BigInteger> factors = new ArrayList<>();
        BigInteger counter = BigInteger.TWO;
        while(true) {
            if (number.mod(counter).compareTo(BigInteger.ZERO) == 0) {
                System.out.printf("%s mod %s == %s%n", number, counter, number.mod(counter));
                number = number.divide(counter);
                factors.add(counter);
            }

            if (number.compareTo(BigInteger.ONE) == 0) {
                return factors;
            }

            counter = counter.add(BigInteger.ONE);
        }
    }
}
