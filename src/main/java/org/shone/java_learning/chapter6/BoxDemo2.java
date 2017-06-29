package org.shone.java_learning.chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10;
        mybox1.heith = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.heith = 6;
        mybox2.depth = 9;

        double vol = mybox1.width * mybox1.heith * mybox1.depth;
        System.out.println("V of mybox1 = " + vol);


        vol = mybox2.width * mybox2.heith * mybox2.depth;
        System.out.println("V of mybox2 = " + vol);
    }
}

