package org.shone.java_learning.chapter3;

public class Scope {
    public static void main(String[] args) {
        int x = 10;

        if (x == 10) {
            int y = 20;

            System.out.println("x and y: " + x + " " + y);

            y *= 2;
        }

        //y = 100; ERROR!

        System.out.println("x = " + x);
    }
}
