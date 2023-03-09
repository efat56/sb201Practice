package com.thread;

public class ThreadX implements Runnable {


    @Override
    public void run() {
        for(int i=0; i<20; i++){
            //Thread.currentThread().setName("Efat");
            String name = Thread.currentThread().getName();
            System.out.println(name+" is running");
        }
    }
}
