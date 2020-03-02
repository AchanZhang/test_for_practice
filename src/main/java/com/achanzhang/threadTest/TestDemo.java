package com.achanzhang.threadTest;

public class TestDemo {
    public static void main(String[] args) {
        TestRunnable testRunnable = new TestRunnable();
        Thread thread = new Thread(testRunnable);
        //设置守护进程
//        thread.setDaemon(true);
        thread.start();
    }
}
