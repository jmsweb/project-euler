package com.jmsweb.algorithm;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberPalindrome {

    public List<BigInteger> largestPalindrome(int digit) {
        Map<Integer, List<BigInteger>> palindrome = new HashMap<Integer, List<BigInteger>>();
        BigInteger start = startMaximum(digit);
        for (BigInteger left = start; left.compareTo(BigInteger.ZERO) > 0; left = left.subtract(BigInteger.ONE)) {
            for (BigInteger right = start; right.compareTo(BigInteger.ZERO) > 0; right = right.subtract(BigInteger.ONE)) {
                String original = left.multiply(right).toString();
                if (original.length() == 1) {
                    continue;
                }

                String reversed = new StringBuilder(original).reverse().toString();
                if (original.equals(reversed)) {
                    palindrome.put(Integer.parseInt(original), Arrays.asList(left, right));
                }
            }
        }

        if (palindrome.size() > 0) {
            Integer maxKey = Collections.max(palindrome.keySet());
            return palindrome.get(maxKey);
        }

        return Arrays.asList(BigInteger.ZERO, BigInteger.ZERO);
    }

    private BigInteger startMaximum(int digit) {
        String number = "1";
        for (int i = 0; i < digit; i++) {
            number += "0";
        }

        return new BigInteger(number).subtract(BigInteger.ONE);
    }
}
