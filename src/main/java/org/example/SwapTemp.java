//1. Suppose, a=10 and b=20. Now swap the value using a temp variable.
// Output: a=20, b=10
package org.example;

public class SwapTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        System.out.println("Before Swapping:");
        System.out.println("The Value Of a = "+ a);
        System.out.println("The Value Of b = "+ b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:");
        System.out.println("The Value Of a = "+ a);
        System.out.println("The Value Of b = "+ b);
    }
}