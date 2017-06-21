package org.shone.java_learning.chapter4;

public class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i;//abc
        System.out.println("abs(k) = " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("abc(k) = " + k);
    }
}
