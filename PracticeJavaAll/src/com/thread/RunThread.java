package com.thread;

public class RunThread implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<=20; i++ ){
            String name3 = Thread.currentThread().getName();
            System.out.println(name3);

        }

    }

    public static void main(String[] args) {
        RunThread job = new RunThread();

        Thread thr = new Thread(job);
        Thread thr2 = new Thread(job);

        thr.setName("Kohali is running");
        thr2.setName("Dhoni is running");

        thr.start();
        thr2.start();
    }
}
