package com.thread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(
                ()->{
                    System.out.println("Thread is running");
                    //System.out.println("Sleeping....");
                    Thread.currentThread().setName("Efat");
                    System.out.println(Thread.currentThread().getName());
                    Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                    System.out.println(Thread.currentThread().getPriority());
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Waking.......");
                }



        );
        thread.start();

    }

}
