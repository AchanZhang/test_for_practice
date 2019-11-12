package com.achanzhang.testforpractice.demo02.setName;

import org.springframework.beans.BeanUtils;

public class MyThread extends Thread{

    public MyThread(){};

    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
