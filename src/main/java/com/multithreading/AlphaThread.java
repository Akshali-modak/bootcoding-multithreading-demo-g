package com.multithreading;

public class AlphaThread extends Thread{
    public void run(){
        for (int i = 0; i< 10; i++){
            System.out.println("Alphabet Thread is executed!");
        }
    }
}
