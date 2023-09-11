package com.multithreading;

public class NumberOfThread extends Thread {
    public void run(){
        for(int i = 0; i < 10; i++) {
            System.out.println("Number Task is executed!");
        }
    }
}
