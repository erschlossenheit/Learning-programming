package org.shone.java_learning.chapter3;

public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days, seconds, distance;

        lightSpeed = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = seconds * lightSpeed;

        System.out.print("For " + days + " days");
        System.out.print(" the light will pass about " + distance + " miles");
    }
}
