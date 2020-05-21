package com.jmsweb.quadrant1;

import java.math.BigInteger;
import java.util.List;

import com.jmsweb.algorithm.NumberPalindrome;

public class Problem4 {

    static NumberPalindrome numberPalindrome;

    public static void main(String[] args) {
        Problem4 problem = new Problem4();
        List<BigInteger> products;
        numberPalindrome = problem.getNumberPalindrome();

        products = numberPalindrome.largestPalindrome(1);
        System.out.printf("Maximum palindrome %s by %s-digit possible: %s%n", products.get(0).multiply(products.get(1)), 1, products);

        products = numberPalindrome.largestPalindrome(2);
        System.out.printf("Maximum palindrome %s by %s-digit possible: %s%n", products.get(0).multiply(products.get(1)), 2, products);

        products = numberPalindrome.largestPalindrome(3);
        System.out.printf("Maximum palindrome %s by %s-digit possible: %s%n", products.get(0).multiply(products.get(1)), 3, products);

//        products = numberPalindrome.largestPalindrome(4);
//        System.out.printf("Maximum palindrome %s by %s-digit possible: %s%n", products.get(0).multiply(products.get(1)), 4, products);
    }

    public NumberPalindrome getNumberPalindrome() {
        return new NumberPalindrome();
    }
}
