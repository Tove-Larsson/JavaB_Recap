package com.tove.demo;

public class Counter {

    // Static points at same memory address
    static int count;

    public void increaseCount() {
        System.out.println(count);
        count++;
        System.out.println(count);
    }

    public static void increaseByTwo() {
        System.out.println(count);
        count += 2;
        System.out.println(count);

    }
    public static void sayHello() {
        System.out.println("Say hi");

    }

}
