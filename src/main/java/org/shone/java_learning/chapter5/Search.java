package org.shone.java_learning.chapter5;

public class Search {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 1, 5, 6, 1, 4};
        int value = 5;
        boolean found = false;
        int time = 0;

        for (int x : nums) {
            if (x == value) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value found.");
        } else {
            System.err.println("Value not found!");
        }
    }
}
