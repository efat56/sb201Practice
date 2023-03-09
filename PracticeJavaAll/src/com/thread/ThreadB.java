package com.thread;

public class ThreadB extends Thread{
    @Override
    public void run(){
        for(int i=20; i<30; i++){
            System.out.println("inside the rum method of ThreadB "+i);
        }
        System.out.println("end of the threadB");
    }
}
