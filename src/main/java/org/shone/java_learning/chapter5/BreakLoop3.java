package org.shone.java_learning.chapter5;

public class BreakLoop3 {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 3; i++) {
            System.out.print("Connector " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer;

                System.out.print(j + " ");
            }
            System.out.println("This line wont' input");
        }
        System.out.println("Loops are complete.");
        int x = 5 + 5;
        System.out.println(x);
    }
}
