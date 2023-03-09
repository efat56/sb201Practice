package com.thread;

public class Main2 {
    public static void main(String[] args) {
        ThreadX x = new ThreadX();
        ThreadY y = new ThreadY();

        Thread th = new Thread(x);
        Thread th2 = new Thread(y);

        th.setName("Efat");
        th2.setName("Sifat");

        th.start();
        th2.start();


    }
}
