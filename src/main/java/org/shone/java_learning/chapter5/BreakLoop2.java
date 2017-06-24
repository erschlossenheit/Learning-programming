package org.shone.java_learning.chapter5;

public class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 100) {
            if (i == 0) break;

            System.out.println("i = " + i);
        }
        System.out.println("Loop was broken");
    }
}
