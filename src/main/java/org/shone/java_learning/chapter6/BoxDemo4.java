package org.shone.java_learning.chapter6;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.depth = 10;
        box1.heith = 20;
        box1.width = 15;

        box2.depth = 3;
        box2.heith = 6;
        box2.width = 9;

        double vol;

        vol = box1.volume();
        System.out.println("box1's volume = " + vol);

        vol = box2.volume();
        System.out.println("box2's volume = " + vol);
    }
}
