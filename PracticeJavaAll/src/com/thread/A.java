package com.thread;

public class A implements Runnable{
    int sum;

    @Override
    public void run() {
        for(int i=0; i<=10; i++){
            System.out.println("inside the run method");
            sum+=i;

        }
    }

    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        Thread t = new Thread(a);
        t.start();

        //t.join();//Here main thread will wait until the t thread completes
                 //if we comment t.join then we will get incorrect value.
        int result = a.sum;
        for (int i = 0; i < 10; i++) {
            System.out.println("inside main thread....");
            System.out.println(result);
        }
    }
}
