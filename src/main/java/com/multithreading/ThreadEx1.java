package com.multithreading;
public class ThreadEx1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread t1 = new NumberOfThread();
        t1.start();
        Thread t2 = new AlphaThread();
        t2.start();
        Thread t3 = new SpecialSymbolOfThread();
        t3.start();
    }


}
