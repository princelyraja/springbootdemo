package com.example.walmart.demo;

public class TestDemo {

    public static void main(String[] args) {

        ThreadDemo thread = new ThreadDemo();
        thread.start();

        for (int i = 0; i < 10; i++) {

            System.out.println(i);

        }

    }

}

class ThreadDemo extends Thread {

    @Override
    public synchronized void start() {

        System.out.println("Inside Start!!!");

    }

    @Override
    public void run() {

        System.out.println("Inside Run!!!");

    }

}
