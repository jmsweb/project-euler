package com.jmsweb.algorithm;

import java.math.BigInteger;

import com.jmsweb.constant.Digit;

public class DigitSearch implements Digit {

    public BigInteger[] object(int max) {
        BigInteger product = BigInteger.ONE;
        BigInteger total = BigInteger.ZERO;
        BigInteger products = BigInteger.ZERO;

        for(int i = 0; i < THIRTEEN.length(); i++) {
            if (i + 13 > THIRTEEN.length()) {
                break;
            }

            String digits = THIRTEEN.substring(i, i + max);

            //Faster processing to scan for zero saves at least ~20ms
            if (digits.contains("0")) {
                i += max - 1;
                continue;
            }

            for (int j = 0; j < max; j++) {
                BigInteger single = new BigInteger(String.valueOf(digits.charAt(j)));
                if (single.compareTo(BigInteger.ONE) == 0) {
                    continue;
                }
                product = product.multiply(single);
            }

            if (product.compareTo(total) == 1) {
                total = product;
                products = new BigInteger(digits);
            }

            product = BigInteger.ONE;
        }
        return new BigInteger[] { products, total };
    }

    public Long[] primitive(int max) {
        long product = 1;
        long total = 0;
        String products = "";

        for(int i = 0; i < THIRTEEN.length(); i++) {
            if (i + 13 > THIRTEEN.length()) {
                break;
            }

            String digits = THIRTEEN.substring(i, i + max);

            //Faster processing to scan for zero saves at least ~7ms
            if (digits.contains("0")) {
                i += max - 1;
                continue;
            }

            for (int j = 0; j < max; j++) {
                long single = Long.parseLong(String.valueOf(digits.charAt(j)));
                if (single == 1) {
                    continue;
                }
                product *= single;
            }

            if (product > total) {
                total = product;
                products = digits;
            }

            product = 1;
        }

        return new Long[] { Long.parseLong(products), total };
    }
}