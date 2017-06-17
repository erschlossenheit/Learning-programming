package org.shone.learning.chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println("b = " + b);

        b = true;
        System.out.println("b = " + b);

        if(b) System.out.println("It will run");
        b = false;
        if(b) System.out.println("It won't run");

        System.out.println("10 > 9 = " + (10 > 9));
    }
}
