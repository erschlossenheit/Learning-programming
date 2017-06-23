package org.shone.olimpiad_programming.lesson1.a_plus_b;

import java.io.*;
import java.util.*;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a + b;
        out.println(c);
    }

    void run() {
        try (
            //Scanner in = new Scanner(System.in);
            //PrintWriter out = new PrintWriter(System.out);
            Scanner in = new Scanner(new FileReader("sum.in"));
            PrintWriter out = new PrintWriter(new FileWriter("sum.out"));
        ) {
            solve(in, out);
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}