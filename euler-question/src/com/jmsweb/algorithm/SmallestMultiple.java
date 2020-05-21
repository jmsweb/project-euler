package com.jmsweb.algorithm;

import java.math.BigInteger;
import java.util.List;

public class SmallestMultiple {
    
    public BigInteger smallest(int number) {
        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> primes = primeFactor.primes(number);
        BigInteger total = BigInteger.ZERO;
        BigInteger two = BigInteger.TWO;
        BigInteger three = new BigInteger("3");

        for(Integer prime : primes) {
            if (prime == 2) {
                total = two.pow(4);
            } else if (prime == 3) {
                total = total.multiply(three.pow(2)); 
            } else {
                total = total.multiply(new BigInteger(prime.toString()));
            }
        }

        return total;
    }

    public BigInteger smallest(String initial, String max) {
        BigInteger number = new BigInteger(initial);
        BigInteger counter = BigInteger.ONE;
        BigInteger maximum = new BigInteger(max);

        while(true) {
            if (number.mod(counter).compareTo(BigInteger.ZERO) == 0) {
                counter = counter.add(BigInteger.ONE);
            } else {
                number = number.add(BigInteger.ONE);
                counter = BigInteger.ONE;
            }

            if (counter.compareTo(maximum) == 0) {
                return number;
            }
        }
    }

    public long smallest(long number, long max) {
        long counter = 1;

        while(true) {
            if (number % counter == 0) {
                counter++;
            } else {
                number++;
                counter = 1;
            }

            if (counter == max) {
                return number;
            }
        }
    }
}