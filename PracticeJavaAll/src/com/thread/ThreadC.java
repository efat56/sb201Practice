package com.thread;

public class ThreadC extends  Thread{
    public void run(){
        for(int i=30; i<50; i++){
            System.out.println("inside the run method of ThreadC "+i);

        }
        System.out.println("End of the threadC");
    }
}
