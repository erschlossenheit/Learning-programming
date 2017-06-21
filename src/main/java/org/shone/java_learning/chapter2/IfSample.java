package org.shone.java_learning.chapter2;

public class IfSample {
    public static void main(String[] args) {
        int y, x;
        y = 20;
        x = 10;

        if(x < y) {
            System.out.println("x < y");
        }

        x *= 2;

        if (x == y) {
            System.out.println("x = y");
        }

        if (x > y) {
            System.out.println("x > y");
        }
    }
}
