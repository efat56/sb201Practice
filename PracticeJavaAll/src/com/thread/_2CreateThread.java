package com.thread;

public class _2CreateThread {

    public static void main(String[] args) {
        MyThreadFirstWay thread = new MyThreadFirstWay();
        thread.start();

        Thread second = new Thread(new MyRunnable()  );
        second.start();

        Thread lambdaWay = new Thread(()-> System.out.println("this is lambda way")  );
        lambdaWay.start();


    }
}
class MyThreadFirstWay extends Thread{
    @Override
    public void run(){
        System.out.println("this is my first thread");
    }


}
class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("this is my second way thread");
    }
}