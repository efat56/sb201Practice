package com.thread;

public class ThreadA implements Runnable {
    @Override
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println("inside the run method of threadA "+i);
        }
        System.out.println("End of the ThreadA......");
    }

    public static void main(String[] args) {
        ThreadA thread = new ThreadA();
        Thread t1 = new Thread(thread);
        t1.start();

        for(int i=50; i<70; i++){
            System.out.println("inside the main "+i);
        }
        System.out.println("end of the main");
    }
}
