package com.thread;

public class Main4 implements Runnable{

    @Override
    public void run() {
        System.out.println("inside the run method ");
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end of the run method");
    }

    public static void main(String[] args) {
        Main4 main4 = new Main4();

        Thread thread1 = new Thread(main4);
        thread1.setName("Simran");
        thread1.start();
    }
}
