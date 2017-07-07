package org.shone.java_learning.chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.width = 10;
        box1.depth = 15;
        box1.heith = 20;

        box2.width = 3;
        box2.depth = 6;
        box2.heith = 9;

        box1.volume();
        box2.volume();
    }
}
