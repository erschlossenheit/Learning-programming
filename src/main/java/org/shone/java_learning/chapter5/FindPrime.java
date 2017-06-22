package org.shone.java_learning.chapter5;

public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        int solve = num = 14;

        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println(solve + "is a prime number");
        else System.out.println(solve + " isn't a prime number");
    }
}
