package org.shone.java_learning.chapter5;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "one";

        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            case "four":
                System.out.println("four");
                break;
            case "five":
                System.out.println("five");
                break;
            default:
                System.err.println("Number not found!");
                break;
        }
    }
}
