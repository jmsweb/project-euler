package com.jmsweb.quadrant1;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23. 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author dorado
 */
public class Problem1 {

    public static void main(String[] args) {
        Problem1 p1 = new Problem1();
        int range = 0;
        range = 10;
        System.out.printf("Sum of range 1...%s: %s%n", range, p1.sumOfMultiples(range));
        range = 1000;
        System.out.printf("Sum of range 1...%s: %s%n", range, p1.sumOfMultiples(range));
    }

    private int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
