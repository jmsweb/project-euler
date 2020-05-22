package com.jmsweb.quadrant1;

import com.jmsweb.algorithm.SquareDifference;

/**
 * The sum of the squares of the first ten natural numbers is,
 * 1^2+2^2+...+10^2=385=385
 * 
 * The square of the sum of the first ten natural numbers is,
 * (1+2+...+10)^2=55^2=3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385=2640
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * @author dorado
 *
 */
public class Problem6 {

    static SquareDifference squareDifference = new SquareDifference();
    static long timer;

    public static void main(String[] args) {
        timer = System.currentTimeMillis();
        System.out.printf("%s...%s: %s in %sms %n", 1, 10, squareDifference.sum(Integer.valueOf(1), Integer.valueOf(10)), System.currentTimeMillis() - timer);

        timer = System.currentTimeMillis();
        System.out.printf("%s...%s: %s in %sms %n", 1, 100, squareDifference.sum(Integer.valueOf(1), Integer.valueOf(100)), System.currentTimeMillis() - timer);

        timer = System.currentTimeMillis();
        System.out.printf("%s...%s: %s in %sms %n", 1, 10, squareDifference.sum(Long.valueOf(1), Long.valueOf(10)), System.currentTimeMillis() - timer);

        timer = System.currentTimeMillis();
        System.out.printf("%s...%s: %s in %sms %n", 1, 100, squareDifference.sum(Long.valueOf(1), Long.valueOf(100)), System.currentTimeMillis() - timer);
    }
}