package com.thread;

public class Main3 implements Runnable {




    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Main3 main1 = new Main3();
        Main3 main2 = new Main3();
        Main3 main3 = new Main3();

        Thread the = new Thread(main1);

        System.out.println("main1 priority is "+Thread.MIN_PRIORITY);
        System.out.println("main2 priority is "+ Thread.NORM_PRIORITY);
        System.out.println("main3 priority is "+ Thread.MAX_PRIORITY);

        System.out.println("t1 thread priority : " + the.getPriority());
//        System.out.println("t2 thread priority : " + t2.getPriority());
//        System.out.println("t3 thread priority : " + t3.getPriority());




        the.setPriority(5);
    }
}
