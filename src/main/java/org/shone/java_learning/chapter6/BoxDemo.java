package org.shone.java_learning.chapter6;

class Box {
    double width;
    double heith;
    double depth;
}

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        mybox.width = 10;
        mybox.heith = 20;
        mybox.depth = 15;

        double vol = mybox.width * mybox.depth * mybox.heith;
        System.out.println("V = " + vol);
    }
}
