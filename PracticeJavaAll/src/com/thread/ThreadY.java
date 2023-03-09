package com.thread;

public class ThreadY implements Runnable{

    @Override
    public void run() {
        for(int i=20; i<30; i++){
            String name2 = Thread.currentThread().getName();
            System.out.println(name2+" is running");
        }
    }
}
