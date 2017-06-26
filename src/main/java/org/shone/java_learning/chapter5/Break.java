package org.shone.java_learning.chapter5;
import static java.lang.System.*;

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    out.println("Before operator break.");
                    if(t) break second;
                    out.println("This operator won't run");
                }
                out.println("This operator won't run");
            }
            out.println("This operator go after second block");
        }
    }
}
