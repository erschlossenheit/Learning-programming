package org.shone.java_learning.chapter5;

public class BreakErr {
    public static void main(String[] args) {

        one: for (int i = 0; i < 3; i++) {
            System.out.println("Connector " + i);
        }

        for (int j = 0; j < 100; j++) {
            if (j == 10) //Error!!! break one;
            System.out.print(j + " ");
        }
    }
}
