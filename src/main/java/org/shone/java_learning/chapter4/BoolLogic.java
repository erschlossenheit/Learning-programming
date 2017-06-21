package org.shone.java_learning.chapter4;

public class BoolLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;

        System.out.println("a \t\t\t\t\t\t= " + a);
        System.out.println("b \t\t\t\t\t\t= " + b);
        System.out.println("a | b \t\t\t\t\t= " + c);
        System.out.println("a & b \t\t\t\t\t= " + d);
        System.out.println("(!a & b) | (a & !b) \t= " + f);
        System.out.println("!a \t\t\t\t\t\t= " + g);
    }
}
