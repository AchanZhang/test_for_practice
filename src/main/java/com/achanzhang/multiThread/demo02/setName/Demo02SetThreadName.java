package com.achanzhang.multiThread.demo02.setName;

public class Demo02SetThreadName {
    public static void main(String[] args){
        MyThread mt = new MyThread();
        mt.setName("233");
        mt.start();

        new MyThread("566").start();
        System.out.println(Thread.currentThread().getName());
    }
}
