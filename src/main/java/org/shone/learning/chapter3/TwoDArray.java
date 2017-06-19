package org.shone.learning.chapter3;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int twoD[][] = new int[a][b];
        int i, j, k = 0;

        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                System.out.print(twoD[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
