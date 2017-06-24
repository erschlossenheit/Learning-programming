package org.shone.java_learning.chapter5;

public class ForEach2 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,8,9,10};
        int sum = 0;

        for (int x : nums) {
            System.out.println("Value of num = " + x);
            sum += x;
            if(x == 5) break;
        }
        System.out.println("sum of 5 nums = " + sum);
    }
}
