package org.shone.java_learning.chapter5;

import java.io.IOException;

public class Menu {
    public static void main(String[] args) throws IOException{
        char choice;

        do {
            System.out.println("Information about operators");
            System.out.println("    1.if");
            System.out.println("    2.switch");
            System.out.print("Select necessary to you item: ");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '2');

        System.out.println("");

        switch (choice) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if(condition) operator;");
                System.out.println("else operator;");
                return;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch (expression) {");
                System.out.println("    case const:");
                System.out.println("        operators;");
                System.out.println("        brake;");
                System.out.println("    //...");
                System.out.println("}");
                break;
        }
    }
}
