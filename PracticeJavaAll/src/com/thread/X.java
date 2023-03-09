package com.thread;

public class X extends Thread{
    @Override
    public void run(){
        for (int i=0; i<30; i++){
            System.out.println("inside the run method "+i);
        }
        System.out.println("end of the run method");

    }

    public static void main(String[] args) {
        X x1 = new X();
        //x1.run();
        x1.start();

        for(int i=20; i<50; i++){
            System.out.println("inside the main method "+i);

        }
        System.out.println("End of the main method");
    }
}
