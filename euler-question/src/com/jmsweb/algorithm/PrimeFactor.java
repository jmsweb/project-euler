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

    public List<Integer> composites(int num) {
        List<Integer> primes = new ArrayList<>();
        int counter = 4;
        while(true) {
            if (counter % 2 == 0 || counter % 3 == 0) {
                primes.add(counter);
            }

            if(counter >= num) {
                return primes;
            }

            counter++;
        }
    }

    public List<Integer> primes(int num) {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);

        int counter = 4;
        while(true) {
            if (counter % 2 != 0 && counter % 3 != 0) {
                primes.add(counter);
            }

            if(counter >= num) {
                return primes;
            }

            counter++;
        }
    }

    public int nth(int n) {
        int count = 0, num = 1, i = 0;
        while (count < n) {
            num = num + 1;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }

            if (i == num) {
                count++;
            }
        }
        return num;
    }
}
