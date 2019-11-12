package com.achanzhang.testforpractice.demo01.getName;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MyThread extends Thread{
    @Override
    public void run() {
//        String name = getName();
//        System.out.println(name);

        Thread t = Thread.currentThread();
        System.out.println(t);

        String name = t.getName();
        System.out.println(name);
    }
}
