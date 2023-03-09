package com.thread;

public class Demo {
    public static void main(String[] args)  {
        ThreadA threadA = new ThreadA();
        ThreadB threadB =  new ThreadB();
        ThreadC threadC = new ThreadC();

        //threadA.start();
        //threadB.start();
        //threadC.start();

        for(int i=50; i<60; i++){
            if(i==56){
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Thread.currentThread().setName("Efat");
                System.out.println(Thread.currentThread().getName());
            }
            System.out.println("inside a main method "+i);
        }
        System.out.println("End of the main method");
    }


}
